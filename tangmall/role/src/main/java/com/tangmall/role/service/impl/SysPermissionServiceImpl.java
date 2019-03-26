package com.tangmall.role.service.impl;

import com.tangmall.role.common.base.BaseServiceImpl;
import com.tangmall.role.dao.read.base.SysPermissionReadMapper;
import com.tangmall.role.dao.write.base.SysPermissionWriteMapper;
import com.tangmall.role.model.base.SysPermission;
import com.tangmall.role.model.base.SysPermissionExample;
import com.tangmall.role.service.SysPermissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* SysPermissionService实现
* Created by tangbo on 2019/2/22.
*/
@Service
@Transactional
public class SysPermissionServiceImpl extends BaseServiceImpl<SysPermissionReadMapper,SysPermissionWriteMapper, SysPermission, SysPermissionExample> implements SysPermissionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SysPermissionServiceImpl.class);

    @Autowired
    private SysPermissionReadMapper sysPermissionReadMapper;

    @Autowired
    private SysPermissionWriteMapper sysPermissionWriteMapper;
}