package com.tang.wiki.role.dao.read.base;

import com.tang.wiki.role.model.base.SysUserRole;
import com.tang.wiki.role.model.base.SysUserRoleExample;

import java.util.List;

public interface SysUserRoleReadMapper {
    long countByExample(SysUserRoleExample example);

    List<SysUserRole> selectByExample(SysUserRoleExample example);

    SysUserRole selectByPrimaryKey(Integer id);
}