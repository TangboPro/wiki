package com.tang.wiki.role.service;

import com.tang.wiki.common.base.BaseService;
import com.tang.wiki.role.model.base.SysGroup;
import com.tang.wiki.role.model.base.SysGroupExample;

import java.util.List;

/**
* SysGroupService接口
* Created by zhu on 2019/2/22.
*/

public interface SysGroupService extends BaseService<SysGroup, SysGroupExample> {
    List<SysGroup> getSysGroupList(SysGroup group);
}