package com.tang.wiki.role.dao.read.base;

import com.tang.wiki.role.model.base.SysUserGroup;
import com.tang.wiki.role.model.base.SysUserGroupExample;

import java.util.List;

public interface SysUserGroupReadMapper {
    long countByExample(SysUserGroupExample example);

    List<SysUserGroup> selectByExample(SysUserGroupExample example);

    SysUserGroup selectByPrimaryKey(Integer id);
}