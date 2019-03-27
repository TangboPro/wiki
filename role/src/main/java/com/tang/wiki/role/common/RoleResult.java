package com.tang.wiki.role.common;


import com.tang.wiki.common.base.BaseResult;

public class RoleResult extends BaseResult {

    public RoleResult(int code, String message, Object data) {
        super(code, message, data);
    }
    public RoleResult(RoleResultConstant constant, Object data) {
        super(constant.getCode(), constant.getMessage(), data);
    }
}
