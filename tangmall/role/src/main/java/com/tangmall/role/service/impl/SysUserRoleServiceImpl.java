package com.tangmall.role.service.impl;

import com.tangmall.role.common.base.BaseServiceImpl;
import com.tangmall.role.dao.read.base.SysUserRoleReadMapper;
import com.tangmall.role.dao.write.base.SysUserRoleWriteMapper;
import com.tangmall.role.model.base.SysUserRole;
import com.tangmall.role.model.base.SysUserRoleExample;
import com.tangmall.role.service.SysUserRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* SysUserRoleService实现
* Created by tangbo on 2019/2/22.
*/
@Service
@Transactional
public class SysUserRoleServiceImpl extends BaseServiceImpl<SysUserRoleReadMapper,SysUserRoleWriteMapper, SysUserRole, SysUserRoleExample> implements SysUserRoleService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SysUserRoleServiceImpl.class);

    @Autowired
    private SysUserRoleReadMapper sysUserRoleReadMapper;

    @Autowired
    private SysUserRoleWriteMapper sysUserRoleWriteMapper;
}