package com.tangmall.role.controller;

import com.tangmall.role.common.base.BaseController;
import com.tangmall.role.model.base.SysGroup;
import com.tangmall.role.service.SysGroupService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* SysGroupcontroller
* Created by tangbo on 2019/2/22.
*/
@RestController
@RequestMapping("/sysgroup")
public class SysGroupController extends BaseController {

    @Autowired
    SysGroupService sysGroupService;
    private static final Logger LOGGER = LoggerFactory.getLogger(SysGroupController.class);

}