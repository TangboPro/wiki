package com.tangmall.role.service.impl;

import com.tangmall.role.common.base.BaseServiceImpl;
import com.tangmall.role.dao.read.base.SysRolePermissionReadMapper;
import com.tangmall.role.dao.write.base.SysRolePermissionWriteMapper;
import com.tangmall.role.model.base.SysRolePermission;
import com.tangmall.role.model.base.SysRolePermissionExample;
import com.tangmall.role.service.SysRolePermissionService;
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