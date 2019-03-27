package com.tang.wiki.role.service;

import com.tang.wiki.common.base.BaseService;
import com.tang.wiki.role.model.base.SysPermission;
import com.tang.wiki.role.model.base.SysUser;
import com.tang.wiki.role.model.base.SysUserExample;

import java.util.List;

/**
* SysUserService接口
* Created by zhu on 2019/2/22.
*/

public interface SysUserService extends BaseService<SysUser, SysUserExample> {
    public String login(String username, String password);
    public SysUser register(SysUser userInfo);

    SysUser getUserByUsername(String username);

    List<SysPermission> getPermissionList(Integer id);
}