package com.tangmall.role.service;

import com.tangmall.role.common.base.BaseService;
import com.tangmall.role.model.base.SysGroup;
import com.tangmall.role.model.base.SysGroupExample;

import java.util.List;

/**
* SysGroupService接口
* Created by zhu on 2019/2/22.
*/

public interface SysGroupService extends BaseService<SysGroup, SysGroupExample> {
    List<SysGroup> getSysGroupList(SysGroup group);
}