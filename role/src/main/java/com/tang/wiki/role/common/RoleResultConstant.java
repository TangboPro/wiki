package com.tang.wiki.role.common;

public enum RoleResultConstant {
    /**
     * 失败
     */
    FAILED(500, "failed"),

    /**
     * 成功
     */
    SUCCESS(200, "success");

    public int code;

    public String message;

    RoleResultConstant(int code, String message) {
        this.code=code;
        this.message=message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
