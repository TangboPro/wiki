package com.tangmall.role.dao.read.base;

import com.tangmall.role.model.base.SysGroup;
import com.tangmall.role.model.base.SysGroupExample;
import java.util.List;

public interface SysGroupReadMapper {
    long countByExample(SysGroupExample example);

    List<SysGroup> selectByExample(SysGroupExample example);

    SysGroup selectByPrimaryKey(Integer id);
}