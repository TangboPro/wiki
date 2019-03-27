package com.tang.wiki.role.dao.read.base;

import com.tang.wiki.role.model.base.SysUserPermission;
import com.tang.wiki.role.model.base.SysUserPermissionExample;

import java.util.List;

public interface SysUserPermissionReadMapper {
    long countByExample(SysUserPermissionExample example);

    List<SysUserPermission> selectByExample(SysUserPermissionExample example);

    SysUserPermission selectByPrimaryKey(Integer id);
}