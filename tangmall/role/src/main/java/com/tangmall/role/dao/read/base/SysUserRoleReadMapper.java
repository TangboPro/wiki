package com.tangmall.role.dao.read.base;

import com.tangmall.role.model.base.SysUserRole;
import com.tangmall.role.model.base.SysUserRoleExample;
import java.util.List;

public interface SysUserRoleReadMapper {
    long countByExample(SysUserRoleExample example);

    List<SysUserRole> selectByExample(SysUserRoleExample example);

    SysUserRole selectByPrimaryKey(Integer id);
}