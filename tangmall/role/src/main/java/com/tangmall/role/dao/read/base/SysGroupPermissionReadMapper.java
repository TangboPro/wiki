package com.tangmall.role.dao.read.base;

import com.tangmall.role.model.base.SysGroupPermission;
import com.tangmall.role.model.base.SysGroupPermissionExample;
import java.util.List;

public interface SysGroupPermissionReadMapper {
    long countByExample(SysGroupPermissionExample example);

    List<SysGroupPermission> selectByExample(SysGroupPermissionExample example);

    SysGroupPermission selectByPrimaryKey(Integer id);
}