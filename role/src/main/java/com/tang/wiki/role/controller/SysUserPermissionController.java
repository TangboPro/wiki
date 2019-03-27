package com.tang.wiki.role.controller;

import com.tang.wiki.common.base.BaseController;
import com.tang.wiki.common.base.BaseResult;
import com.tang.wiki.role.common.RoleResult;
import com.tang.wiki.role.common.RoleResultConstant;
import com.tang.wiki.role.service.SysUserPermissionService;
import com.tang.wiki.role.service.SysUserService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
            return new RoleResult(RoleResultConstant.SUCCESS,count);
        }
        return new RoleResult(RoleResultConstant.FAILED,count);
    }

}