package com.tangmall.role.dao.read.base;

import com.tangmall.role.model.base.SysRole;
import com.tangmall.role.model.base.SysRoleExample;
import java.util.List;

public interface SysRoleReadMapper {
    long countByExample(SysRoleExample example);

    List<SysRole> selectByExample(SysRoleExample example);

    SysRole selectByPrimaryKey(Integer id);
}