package com.tangmall.role.dao.read.base;

import com.tangmall.role.model.base.SysUser;
import com.tangmall.role.model.base.SysUserExample;
import java.util.List;

public interface SysUserReadMapper {
    long countByExample(SysUserExample example);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(Integer id);
}