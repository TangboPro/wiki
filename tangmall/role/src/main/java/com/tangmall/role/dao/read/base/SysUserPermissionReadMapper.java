package com.tangmall.role.dao.read.base;

import com.tangmall.role.model.base.SysUserPermission;
import com.tangmall.role.model.base.SysUserPermissionExample;
import java.util.List;

public interface SysUserPermissionReadMapper {
    long countByExample(SysUserPermissionExample example);

    List<SysUserPermission> selectByExample(SysUserPermissionExample example);

    SysUserPermission selectByPrimaryKey(Integer id);
}