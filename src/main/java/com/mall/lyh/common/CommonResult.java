package com.mall.lyh.common;

/**
 * 通用返回对象
 * @param <T>
 * @author lyh
 */
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(){

    }

    public CommonResult(Integer code, String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }


    public static <T> CommonResult<T> success(T data){
        return new CommonResult<T>();
    }
}
