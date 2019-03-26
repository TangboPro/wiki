package com.tangmall.role.common;

import com.tangmall.role.common.base.BaseResult;

public class RoleResult extends BaseResult {

    public RoleResult(int code, String message, Object data) {
        super(code, message, data);
    }
    public RoleResult(RoleResultConstant constant, Object data) {
        super(constant.getCode(), constant.getMessage(), data);
    }
}
