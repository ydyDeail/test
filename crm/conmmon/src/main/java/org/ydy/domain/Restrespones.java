package org.ydy.domain;

public class Restrespones<T> {
    private int code;
    private String msg;
    private T result;

    private Restrespones(int code, String msg) {
        this.code=code;
        this.msg=msg;
    }

    public static<T> Restrespones<T> success(){
        return new Restrespones<T>();
    }
    public static<T> Restrespones<T> success(T result){
        Restrespones<T> respones=new Restrespones<T>();
        respones.setResult(result);
        return respones;
    }
    public static<T> Restrespones<T> error(RestCode restCode){
        return new Restrespones<T>(restCode.code,restCode.msg);
    }
    private Restrespones(){
        this(RestCode.OK.code, RestCode.OK.msg);
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}