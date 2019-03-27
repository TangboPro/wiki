package com.tang.wiki.role.service.impl;

import com.tang.wiki.common.base.BaseServiceImpl;
import com.tang.wiki.role.dao.read.base.SysUserRoleReadMapper;
import com.tang.wiki.role.dao.write.base.SysUserRoleWriteMapper;
import com.tang.wiki.role.model.base.SysUserRole;
import com.tang.wiki.role.model.base.SysUserRoleExample;
import com.tang.wiki.role.service.SysUserRoleService;
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