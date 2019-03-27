package com.tang.wiki.role.dao.read.base;

import com.tang.wiki.role.model.base.SysUser;
import com.tang.wiki.role.model.base.SysUserExample;

import java.util.List;

public interface SysUserReadMapper {
    long countByExample(SysUserExample example);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(Integer id);
}