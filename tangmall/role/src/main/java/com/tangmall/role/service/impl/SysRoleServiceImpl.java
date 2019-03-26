package com.tangmall.role.service.impl;

import com.tangmall.role.common.base.BaseServiceImpl;
import com.tangmall.role.dao.read.base.SysRoleReadMapper;
import com.tangmall.role.dao.write.base.SysRoleWriteMapper;
import com.tangmall.role.model.base.SysRole;
import com.tangmall.role.model.base.SysRoleExample;
import com.tangmall.role.service.SysRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* SysRoleService实现
* Created by tangbo on 2019/2/22.
*/
@Service
@Transactional
public class SysRoleServiceImpl extends BaseServiceImpl<SysRoleReadMapper,SysRoleWriteMapper, SysRole, SysRoleExample> implements SysRoleService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SysRoleServiceImpl.class);

    @Autowired
    private SysRoleReadMapper sysRoleReadMapper;

    @Autowired
    private SysRoleWriteMapper sysRoleWriteMapper;
}