package com.tang.wiki.role.service.impl;

import com.tang.wiki.common.base.BaseServiceImpl;
import com.tang.wiki.role.dao.read.base.SysRoleGroupReadMapper;
import com.tang.wiki.role.dao.write.base.SysRoleGroupWriteMapper;
import com.tang.wiki.role.model.base.SysRoleGroup;
import com.tang.wiki.role.model.base.SysRoleGroupExample;
import com.tang.wiki.role.service.SysRoleGroupService;
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