package com.tangmall.role.service.impl;

import com.tangmall.role.common.base.BaseServiceImpl;
import com.tangmall.role.dao.read.base.SysGroupPermissionReadMapper;
import com.tangmall.role.dao.write.base.SysGroupPermissionWriteMapper;
import com.tangmall.role.model.base.SysGroupPermission;
import com.tangmall.role.model.base.SysGroupPermissionExample;
import com.tangmall.role.service.SysGroupPermissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* SysGroupPermissionService实现
* Created by tangbo on 2019/2/22.
*/
@Service
@Transactional
public class SysGroupPermissionServiceImpl extends BaseServiceImpl<SysGroupPermissionReadMapper,SysGroupPermissionWriteMapper, SysGroupPermission, SysGroupPermissionExample> implements SysGroupPermissionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SysGroupPermissionServiceImpl.class);

    @Autowired
    private SysGroupPermissionReadMapper sysGroupPermissionReadMapper;

    @Autowired
    private SysGroupPermissionWriteMapper sysGroupPermissionWriteMapper;
}