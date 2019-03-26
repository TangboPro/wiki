package com.tangmall.role.dao.read;

import com.tangmall.role.model.base.SysPermission;

import java.util.List;

public interface MySysUserPermissionReadMapper {
    List<SysPermission> getUserPermissionList(Integer userId);
}
