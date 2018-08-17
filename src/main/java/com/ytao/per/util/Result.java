package com.ytao.per.util;

/**
 * Created by ybtccc on 2018/8/17.
 */
public class Result<T> {

    private String code = "00";
    private String msg;
    private T data;

    public static Result success(){
        return new Result();
    }

    public static Result success(Object data){
        Result r = new Result();
        r.setData(data);
        return r;
    }

    public static Result error(String code,String msg){
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        return r;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
