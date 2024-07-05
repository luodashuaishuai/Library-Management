package com.example.springboot.common;

import lombok.Data;

/**
 * 浏览器搜索 https://luodashuaishuai.github.io/
 *
 * @author LuoDashuai
 * @date 2024-04-26
 */

@Data
public class Result {
    private static final String SUCCESS_CODE = "200";
    private static final String ERROR_CODE = "-1";


    //接口的响应结果通过code体现
    private String code;
    //data 存储包装的后台信息
    private Object data;
    //msg存放错误信息
    private String msg;

    public static Result success() {
        Result result = new Result();
        result.setCode(SUCCESS_CODE);
        return result;
    }

    public static Result success(Object data) {
        Result result = new Result();
        result.setCode(SUCCESS_CODE);
        result.setData(data);
        return result;
    }
    public static Result error(String msg) {
        Result result = new Result();
        result.setCode(ERROR_CODE);
        result.setMsg(msg);
        return result;
    }
}
