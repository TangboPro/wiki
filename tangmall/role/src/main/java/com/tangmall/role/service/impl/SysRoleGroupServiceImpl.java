package com.tangmall.role.service.impl;

import com.tangmall.role.common.base.BaseServiceImpl;
import com.tangmall.role.dao.read.base.SysRoleGroupReadMapper;
import com.tangmall.role.dao.write.base.SysRoleGroupWriteMapper;
import com.tangmall.role.model.base.SysRoleGroup;
import com.tangmall.role.model.base.SysRoleGroupExample;
import com.tangmall.role.service.SysRoleGroupService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* SysRoleGroupService实现
* Created by tangbo on 2019/2/22.
*/
@Service
@Transactional
public class SysRoleGroupServiceImpl extends BaseServiceImpl<SysRoleGroupReadMapper,SysRoleGroupWriteMapper, SysRoleGroup, SysRoleGroupExample> implements SysRoleGroupService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SysRoleGroupServiceImpl.class);

    @Autowired
    private SysRoleGroupReadMapper sysRoleGroupReadMapper;

    @Autowired
    private SysRoleGroupWriteMapper sysRoleGroupWriteMapper;
}