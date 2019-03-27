package com.tang.wiki.role.service;

import com.tang.wiki.common.base.BaseService;
import com.tang.wiki.role.model.base.SysUserPermission;
import com.tang.wiki.role.model.base.SysUserPermissionExample;

import java.util.List;

/**
* SysUserPermissionService接口
* Created by zhu on 2019/2/22.
*/

public interface SysUserPermissionService extends BaseService<SysUserPermission, SysUserPermissionExample> {

    int updateBatch(Integer adminId, List<Integer> permissionIds);
}