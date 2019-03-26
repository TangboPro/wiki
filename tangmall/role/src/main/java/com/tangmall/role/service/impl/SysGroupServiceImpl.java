package com.tangmall.role.service.impl;

import com.tangmall.role.common.base.BaseServiceImpl;
import com.tangmall.role.dao.read.base.SysGroupReadMapper;
import com.tangmall.role.dao.write.base.SysGroupWriteMapper;
import com.tangmall.role.model.base.SysGroup;
import com.tangmall.role.model.base.SysGroupExample;
import com.tangmall.role.service.SysGroupService;
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