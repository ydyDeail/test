package org.ydy.domain;

public enum RestCode {
    OK(0,"OK"),
    UNKNOWN_ERROR(1,"未知异常"),
    TOMKEN_INVALLD(2,"token失效"),
    USER_NOT_FIND(3,"用户不存在");
    public final int code;
    public final String msg;

    private RestCode(int code, String msg){
        this.code=code;
        this.msg=msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
