package com.tang.wiki.role.dao.read.base;

import com.tang.wiki.role.model.base.SysRoleGroup;
import com.tang.wiki.role.model.base.SysRoleGroupExample;

import java.util.List;

public interface SysRoleGroupReadMapper {
    long countByExample(SysRoleGroupExample example);

    List<SysRoleGroup> selectByExample(SysRoleGroupExample example);

    SysRoleGroup selectByPrimaryKey(Integer id);
}