package com.tang.wiki.role.service.impl;

import com.tang.wiki.common.base.BaseServiceImpl;
import com.tang.wiki.role.dao.read.base.SysUserGroupReadMapper;
import com.tang.wiki.role.dao.write.base.SysUserGroupWriteMapper;
import com.tang.wiki.role.model.base.SysUserGroup;
import com.tang.wiki.role.model.base.SysUserGroupExample;
import com.tang.wiki.role.service.SysUserGroupService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* SysUserGroupService实现
* Created by tangbo on 2019/2/22.
*/
@Service
@Transactional
public class SysUserGroupServiceImpl extends BaseServiceImpl<SysUserGroupReadMapper,SysUserGroupWriteMapper, SysUserGroup, SysUserGroupExample> implements SysUserGroupService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SysUserGroupServiceImpl.class);

    @Autowired
    private SysUserGroupReadMapper sysUserGroupReadMapper;

    @Autowired
    private SysUserGroupWriteMapper sysUserGroupWriteMapper;
}