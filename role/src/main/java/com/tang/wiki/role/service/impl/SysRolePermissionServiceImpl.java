package com.tang.wiki.role.service.impl;

import com.tang.wiki.common.base.BaseServiceImpl;
import com.tang.wiki.role.dao.read.base.SysRolePermissionReadMapper;
import com.tang.wiki.role.dao.write.base.SysRolePermissionWriteMapper;
import com.tang.wiki.role.model.base.SysRolePermission;
import com.tang.wiki.role.model.base.SysRolePermissionExample;
import com.tang.wiki.role.service.SysRolePermissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* SysRolePermissionService实现
* Created by tangbo on 2019/2/22.
*/
@Service
@Transactional
public class SysRolePermissionServiceImpl extends BaseServiceImpl<SysRolePermissionReadMapper,SysRolePermissionWriteMapper, SysRolePermission, SysRolePermissionExample> implements SysRolePermissionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SysRolePermissionServiceImpl.class);

    @Autowired
    private SysRolePermissionReadMapper sysRolePermissionReadMapper;

    @Autowired
    private SysRolePermissionWriteMapper sysRolePermissionWriteMapper;
}