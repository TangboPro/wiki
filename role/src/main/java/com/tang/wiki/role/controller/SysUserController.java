package com.tang.wiki.role.controller;

import com.alibaba.fastjson.JSON;
import com.tang.wiki.role.common.RoleResult;
import com.tang.wiki.role.common.RoleResultConstant;
import com.tang.wiki.common.base.BaseController;
import com.tang.wiki.role.model.base.SysUser;
import com.tang.wiki.role.model.base.SysUserExample;
import com.tang.wiki.role.service.SysUserService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
* SysUsercontroller
* Created by tangbo on 2019/2/22.
*/
@RestController
@RequestMapping("/sysuser")
public class SysUserController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SysUserController.class);

    @Autowired
    SysUserService sysUserService;

    @ApiOperation(value = "分页获取用户列表")
    @GetMapping(value = "/getuserlist")
    @ResponseBody
    public Object getUserList(@RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize,
                              @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                              HttpServletResponse response, HttpServletRequest request) {
        SysUserExample example=new SysUserExample();
        List<SysUser> userList=sysUserService.selectByExampleForStartPage(example,pageNum,pageSize);
        LOGGER.info("userList: "+JSON.toJSONString(userList));
        return new RoleResult(RoleResultConstant.SUCCESS,userList);
    }

    @ApiOperation(value = "添加用户")
    @GetMapping(value = "/insertUser")
    @ResponseBody
    public Object insertUserInfo(@RequestBody SysUser userInfo, HttpServletResponse response, HttpServletRequest request) {
        SysUser user=sysUserService.register(userInfo);
        if(user==null){

            return new RoleResult(RoleResultConstant.FAILED,null);
        }
        return new RoleResult(RoleResultConstant.FAILED,user);
    }
}