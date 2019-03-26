package com.tangmall.role.dao.read.base;

import com.tangmall.role.model.base.SysRoleGroup;
import com.tangmall.role.model.base.SysRoleGroupExample;
import java.util.List;

public interface SysRoleGroupReadMapper {
    long countByExample(SysRoleGroupExample example);

    List<SysRoleGroup> selectByExample(SysRoleGroupExample example);

    SysRoleGroup selectByPrimaryKey(Integer id);
}