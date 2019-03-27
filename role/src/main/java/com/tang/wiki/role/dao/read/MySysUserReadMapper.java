package com.tang.wiki.role.dao.read;

import com.tang.wiki.role.model.base.SysUser;

public interface MySysUserReadMapper {
    SysUser findByUsername(String username);
//    List<SysUserPermission> getUserPermissions(Integer id);

}
