package com.tangmall.role.service.impl;

import com.tangmall.role.common.base.BaseServiceImpl;
import com.tangmall.role.dao.read.base.SysUserPermissionReadMapper;
import com.tangmall.role.dao.write.MySysUserPermissionWriteMapper;
import com.tangmall.role.dao.write.base.SysUserPermissionWriteMapper;
import com.tangmall.role.model.base.SysUserPermission;
import com.tangmall.role.model.base.SysUserPermissionExample;
import com.tangmall.role.service.SysUserPermissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
* SysUserPermissionService实现
* Created by tangbo on 2019/2/22.
*/
@Service
@Transactional
public class SysUserPermissionServiceImpl extends BaseServiceImpl<SysUserPermissionReadMapper,SysUserPermissionWriteMapper, SysUserPermission, SysUserPermissionExample> implements SysUserPermissionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SysUserPermissionServiceImpl.class);

    @Autowired
    private SysUserPermissionReadMapper sysUserPermissionReadMapper;

    @Autowired
    private SysUserPermissionWriteMapper sysUserPermissionWriteMapper;
    @Autowired
    private MySysUserPermissionWriteMapper mySysUserPermissionWriteMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateBatch(Integer userId, List<Integer> permissionIds){
        SysUserPermissionExample relationExample = new SysUserPermissionExample();
        relationExample.createCriteria().andUserIdEqualTo(userId);
        sysUserPermissionWriteMapper.deleteByExample(relationExample);
        List<SysUserPermission> relationList = permissionIds.stream().map(permissionId -> {
            SysUserPermission relation = new SysUserPermission();
            relation.setUserId(userId);
            relation.setPermissionType(1);
            relation.setPermissionId(permissionId);
            return relation;
        }).collect(Collectors.toList());
        return mySysUserPermissionWriteMapper.insertBatch(relationList);
    }
}