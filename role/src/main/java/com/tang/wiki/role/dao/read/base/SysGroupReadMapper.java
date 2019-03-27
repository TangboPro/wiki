package com.tang.wiki.role.dao.read.base;

import com.tang.wiki.role.model.base.SysGroup;
import com.tang.wiki.role.model.base.SysGroupExample;

import java.util.List;

public interface SysGroupReadMapper {
    long countByExample(SysGroupExample example);

    List<SysGroup> selectByExample(SysGroupExample example);

    SysGroup selectByPrimaryKey(Integer id);
}