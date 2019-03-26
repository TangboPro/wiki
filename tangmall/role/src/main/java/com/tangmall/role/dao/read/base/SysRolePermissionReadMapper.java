package com.tangmall.role.dao.read.base;

import com.tangmall.role.model.base.SysRolePermission;
import com.tangmall.role.model.base.SysRolePermissionExample;
import java.util.List;

public interface SysRolePermissionReadMapper {
    long countByExample(SysRolePermissionExample example);

    List<SysRolePermission> selectByExample(SysRolePermissionExample example);

    SysRolePermission selectByPrimaryKey(Integer id);
}