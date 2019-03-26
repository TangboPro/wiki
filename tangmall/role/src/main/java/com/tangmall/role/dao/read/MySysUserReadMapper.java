package com.tangmall.role.dao.read;

import com.tangmall.role.model.base.SysUser;
import com.tangmall.role.model.base.SysUserPermission;

import java.util.List;

public interface MySysUserReadMapper {
    SysUser findByUsername(String username);
//    List<SysUserPermission> getUserPermissions(Integer id);

}
