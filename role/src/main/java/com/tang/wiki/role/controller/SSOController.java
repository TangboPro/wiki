package com.tang.wiki.role.controller;

import com.tang.wiki.role.common.RoleResult;
import com.tang.wiki.role.common.RoleResultConstant;
import com.tang.wiki.common.base.BaseController;
import com.tang.wiki.common.utils.VerifyCodeUtils;
import com.tang.wiki.role.model.base.SysUser;
import com.tang.wiki.role.service.SysUserService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.SpringSecurityCoreVersion;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/sso")
public class SSOController extends BaseController {

    private final Logger LOGGER = LoggerFactory.getLogger(SSOController.class);

    @Value("${jwt.header}")
    private String tokenHeader;
    @Autowired
    SysUserService  sysUserService;
    /**
     * 登录动作
     */
    @ApiOperation(value = "用户请求登陆")
    @PostMapping(value = "/login")
    @ResponseBody
    public Object login(@RequestBody SysUser userInfo, HttpServletResponse response, HttpServletRequest request) {
        LOGGER.info("用户请求登陆"+userInfo.toString());
        String token=sysUserService.login(userInfo.getUsername(),userInfo.getPassword());
        if (token == null) {
            return new RoleResult(RoleResultConstant.FAILED,null);

        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHeader);
        return new RoleResult(RoleResultConstant.SUCCESS,tokenMap);
    }
    @ApiOperation(value = "获取当前登录用户信息")
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public Object getAdminInfo(Principal principal,HttpServletResponse response, HttpServletRequest request) {
        String  username = principal.getName();
        SysUser umsAdmin = sysUserService.getUserByUsername(username);
        Map<String, Object> data = new HashMap<>();
        data.put("username", umsAdmin.getUsername());
        data.put("roles", new String[]{"TEST"});
        return new RoleResult(RoleResultConstant.SUCCESS,data);
    }

    @ApiOperation(value = "注销功能")
    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    @ResponseBody
    public Object logout(HttpServletResponse response, HttpServletRequest request) {
        return new RoleResult(RoleResultConstant.SUCCESS,null);
    }
    @GetMapping(value = "/getVerifyCode")
    public void getVerifyCode(HttpServletResponse response, HttpServletRequest request) {
        try {
            response.setHeader("Pragma", "No-cache");
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expires", 0);
            response.setContentType("image/jpg");

            //生成随机字串
            String verifyCode = VerifyCodeUtils.generateVerifyCode(4);
            LOGGER.info("验证码:{}", verifyCode);
            //存入会话session
            HttpSession session = request.getSession(true);
            session.setAttribute("_code", verifyCode.toLowerCase());
            //生成图片
            int w = 146, h = 33;
            VerifyCodeUtils.outputImage(w, h, response.getOutputStream(), verifyCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
