package com.tang.wiki.role.dao.read.base;

import com.tang.wiki.role.model.base.SysRole;
import com.tang.wiki.role.model.base.SysRoleExample;

import java.util.List;

public interface SysRoleReadMapper {
    long countByExample(SysRoleExample example);

    List<SysRole> selectByExample(SysRoleExample example);

    SysRole selectByPrimaryKey(Integer id);
}