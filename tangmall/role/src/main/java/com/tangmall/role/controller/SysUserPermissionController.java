package com.tangmall.role.controller;

import com.tangmall.role.common.base.BaseController;
import com.tangmall.role.common.base.BaseResult;
import com.tangmall.role.model.base.SysUserPermission;
import com.tangmall.role.service.SysUserPermissionService;
import com.tangmall.role.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
* SysUserPermissioncontroller
* Created by tangbo on 2019/2/22.
*/
@RestController
@RequestMapping("/sysuserpermission")
public class SysUserPermissionController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SysUserPermissionController.class);
    @Autowired
    SysUserService sysUserService;
    @Autowired
    SysUserPermissionService sysUserPermissionService;

    @ApiOperation("给用户分配权限")
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public Object updatePermission(@RequestParam Integer adminId,
                                   @RequestParam("permissionIds") List<Integer> permissionIds){
        int count = sysUserPermissionService.updateBatch(adminId,permissionIds);
        if(count>0){
            return new BaseResult().success(count);
        }
        return new BaseResult().failed("更新失败");
    }

}