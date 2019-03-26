package com.tangmall.role.dao.read.base;

import com.tangmall.role.model.base.SysPermission;
import com.tangmall.role.model.base.SysPermissionExample;
import java.util.List;

public interface SysPermissionReadMapper {
    long countByExample(SysPermissionExample example);

    List<SysPermission> selectByExample(SysPermissionExample example);

    SysPermission selectByPrimaryKey(Integer id);
}