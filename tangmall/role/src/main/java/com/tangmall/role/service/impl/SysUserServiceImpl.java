package com.tangmall.role.service.impl;

import com.tangmall.role.common.AdminUserDetails;
import com.tangmall.role.common.base.BaseServiceImpl;
import com.tangmall.role.common.utils.RedisUtil;
import com.tangmall.role.component.JwtTokenUtil;
import com.tangmall.role.dao.read.MySysUserPermissionReadMapper;
import com.tangmall.role.dao.read.MySysUserReadMapper;
import com.tangmall.role.dao.read.base.SysUserReadMapper;
import com.tangmall.role.dao.write.base.SysUserWriteMapper;
import com.tangmall.role.model.base.SysPermission;
import com.tangmall.role.model.base.SysUser;
import com.tangmall.role.model.base.SysUserExample;
import com.tangmall.role.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
* SysUserService实现
* Created by tangbo on 2019/2/22.
*/
@Service
public class SysUserServiceImpl extends BaseServiceImpl<SysUserReadMapper,SysUserWriteMapper, SysUser, SysUserExample> implements SysUserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SysUserServiceImpl.class);

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private SysUserReadMapper sysUserReadMapper;

    @Autowired
    private SysUserWriteMapper sysUserWriteMapper;

    @Autowired
    private MySysUserReadMapper mySysUserReadMapper;

    @Autowired
    private MySysUserPermissionReadMapper mySysUserPermissionReadMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    RedisUtil redisUtil;

    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @Override
    public String login(String username,String password) {
        String token = null;
        //密码需要客户端加密后传递
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username,password);
        try {
            LOGGER.info("密码"+new BCryptPasswordEncoder().encode(password));
            Authentication authentication = authenticationManager.authenticate(authenticationToken);
            SecurityContextHolder.getContext().setAuthentication(authentication);
            SysUser admin = this.getUserByUsername(username);
            if (admin != null) {
                List<SysPermission> permissionList = this.getPermissionList(admin.getId());
                UserDetails userDetails=new AdminUserDetails(admin,permissionList);
                token = jwtTokenUtil.generateToken(userDetails);
                updateLoginTimeByUserId(admin.getId());
            }
        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
        return token;
    }

    @Override
    public SysUser register(SysUser userInfo) {
        SysUser user=this.getUserByUsername(userInfo.getUsername());
        if(user!=null){
            return null;
        }
       userInfo.setId(null);
       userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
       userInfo.setLocked(false);
       userInfo.setCreateTime(new Date());
       int count=this.insertSelective(userInfo);
       if(count<=0){
           return null;
       }
        return userInfo;
    }

    /**
     * 更新登陆时间
     * @param userId
     */
    private void updateLoginTimeByUserId(Integer userId) {
        SysUser user=new SysUser();
        user.setId(userId);
        user.setLastlogin(new Date());
        sysUserWriteMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public SysUser getUserByUsername(String username) {
        String key="role_getUserByUsername_" + username;
        if (redisUtil.hasKey(key)) {
            return (SysUser) redisUtil.get(key);
        }
        SysUserExample example=new SysUserExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<SysUser> adminList = sysUserReadMapper.selectByExample(example);
        if (adminList != null && adminList.size() > 0) {
            redisUtil.set(key,adminList.get(0),60*5);
            return adminList.get(0);
        }
        return null;
    }
    @Override
    public List<SysPermission> getPermissionList(Integer id){
        return mySysUserPermissionReadMapper.getUserPermissionList(id);
    }
}