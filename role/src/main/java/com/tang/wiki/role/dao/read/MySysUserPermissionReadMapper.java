package com.tang.wiki.role.dao.read;

import com.tang.wiki.role.model.base.SysPermission;

import java.util.List;

public interface MySysUserPermissionReadMapper {
    List<SysPermission> getUserPermissionList(Integer userId);
}
