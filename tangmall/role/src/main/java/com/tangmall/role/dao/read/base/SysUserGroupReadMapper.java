package com.tangmall.role.dao.read.base;

import com.tangmall.role.model.base.SysUserGroup;
import com.tangmall.role.model.base.SysUserGroupExample;
import java.util.List;

public interface SysUserGroupReadMapper {
    long countByExample(SysUserGroupExample example);

    List<SysUserGroup> selectByExample(SysUserGroupExample example);

    SysUserGroup selectByPrimaryKey(Integer id);
}