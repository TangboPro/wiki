package com.tang.wiki.role.dao.read.base;

import com.tang.wiki.role.model.base.SysGroupPermission;
import com.tang.wiki.role.model.base.SysGroupPermissionExample;

import java.util.List;

public interface SysGroupPermissionReadMapper {
    long countByExample(SysGroupPermissionExample example);

    List<SysGroupPermission> selectByExample(SysGroupPermissionExample example);

    SysGroupPermission selectByPrimaryKey(Integer id);
}