package com.mall.lyh.common;

/**
 * 枚举常用的API操作码
 * @author lyh 2021-05-31
 */
public enum ResultCode implements IErrorCode{
    // 操作成功
    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    VALIDATE_FAILED(404, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限");
    private final Integer code;
    private final String message;

    /**
     * @param code 返回号
     * @param message 信息
     */
    private ResultCode(Integer code, String message){
        this.code = code;
        this.message = message;
    }


    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
