package com.tangmall.role.service;

import com.tangmall.role.common.base.BaseService;
import com.tangmall.role.model.base.SysPermission;
import com.tangmall.role.model.base.SysUser;
import com.tangmall.role.model.base.SysUserExample;

import java.util.List;

/**
* SysUserService接口
* Created by zhu on 2019/2/22.
*/

public interface SysUserService extends BaseService<SysUser, SysUserExample> {
    public String login(String username,String password);
    public SysUser register(SysUser userInfo);

    SysUser getUserByUsername(String username);

    List<SysPermission> getPermissionList(Integer id);
}