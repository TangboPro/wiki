package com.tang.wiki.role.service.impl;

import com.tang.wiki.common.base.BaseServiceImpl;
import com.tang.wiki.role.dao.read.base.SysUserPermissionReadMapper;
import com.tang.wiki.role.dao.write.MySysUserPermissionWriteMapper;
import com.tang.wiki.role.dao.write.base.SysUserPermissionWriteMapper;
import com.tang.wiki.role.model.base.SysUserPermission;
import com.tang.wiki.role.model.base.SysUserPermissionExample;
import com.tang.wiki.role.service.SysUserPermissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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