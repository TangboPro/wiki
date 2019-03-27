package com.tang.wiki.role.dao.read.base;

import com.tang.wiki.role.model.base.SysPermission;
import com.tang.wiki.role.model.base.SysPermissionExample;

import java.util.List;

public interface SysPermissionReadMapper {
    long countByExample(SysPermissionExample example);

    List<SysPermission> selectByExample(SysPermissionExample example);

    SysPermission selectByPrimaryKey(Integer id);
}