package com.tang.wiki.role.dao.read.base;

import com.tang.wiki.role.model.base.SysRolePermission;
import com.tang.wiki.role.model.base.SysRolePermissionExample;

import java.util.List;

public interface SysRolePermissionReadMapper {
    long countByExample(SysRolePermissionExample example);

    List<SysRolePermission> selectByExample(SysRolePermissionExample example);

    SysRolePermission selectByPrimaryKey(Integer id);
}