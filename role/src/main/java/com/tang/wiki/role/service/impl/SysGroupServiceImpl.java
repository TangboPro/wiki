package com.tang.wiki.role.service.impl;

import com.tang.wiki.common.base.BaseServiceImpl;
import com.tang.wiki.role.dao.read.base.SysGroupReadMapper;
import com.tang.wiki.role.dao.write.base.SysGroupWriteMapper;
import com.tang.wiki.role.model.base.SysGroup;
import com.tang.wiki.role.model.base.SysGroupExample;
import com.tang.wiki.role.service.SysGroupService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
* SysGroupService实现
* Created by tangbo on 2019/2/22.
*/
@Service
@Transactional
public class SysGroupServiceImpl extends BaseServiceImpl<SysGroupReadMapper,SysGroupWriteMapper, SysGroup, SysGroupExample> implements SysGroupService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SysGroupServiceImpl.class);

    @Autowired
    private SysGroupReadMapper sysGroupReadMapper;

    @Autowired
    private SysGroupWriteMapper sysGroupWriteMapper;

    @Override
    public List<SysGroup> getSysGroupList(SysGroup group) {
        SysGroupExample sysGroupExample=new SysGroupExample();
        return sysGroupReadMapper.selectByExample(sysGroupExample);
    }
}