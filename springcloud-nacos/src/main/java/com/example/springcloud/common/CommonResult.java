package com.example.springcloud.common;

/**
 * 通用返回对象
 * Created by macro on 2019/4/19.
 */
public class CommonResult<T> {
    private long code;
    private String message;
    private T data;

    protected CommonResult() {
    }

    protected CommonResult(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     */
    public static <T> com.example.springcloud.common.CommonResult<T> success(T data) {
        return new com.example.springcloud.common.CommonResult<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     * @param  message 提示信息
     */
    public static <T> com.example.springcloud.common.CommonResult<T> success(T data, String message) {
        return new com.example.springcloud.common.CommonResult<T>(ResultCode.SUCCESS.getCode(), message, data);
    }

    /**
     * 失败返回结果
     * @param errorCode 错误码
     */
    public static <T> com.example.springcloud.common.CommonResult<T> failed(IErrorCode errorCode) {
        return new com.example.springcloud.common.CommonResult<T>(errorCode.getCode(), errorCode.getMessage(), null);
    }


    /**
     * 失败返回结果
     * @param message 提示信息
     */
    public static <T> com.example.springcloud.common.CommonResult<T> failed(String message) {
        return new com.example.springcloud.common.CommonResult<T>(ResultCode.FAILED.getCode(), message, null);
    }

    /**
     * 失败返回结果
     * @param message 提示信息
     */
    public static <T> com.example.springcloud.common.CommonResult<T> failed(long code, String message) {
        return new com.example.springcloud.common.CommonResult<T>(code, message, null);
    }

    public static <T> com.example.springcloud.common.CommonResult<T> failed(T data, String message) {
        return new com.example.springcloud.common.CommonResult<T>(ResultCode.FAILED.getCode(), message, data);
    }

    /**
     * 失败返回结果
     */
    public static <T> com.example.springcloud.common.CommonResult<T> failed() {
        return failed(ResultCode.FAILED);
    }

    /**
     * 参数验证失败返回结果
     */
    public static <T> com.example.springcloud.common.CommonResult<T> validateFailed() {
        return failed(ResultCode.VALIDATE_FAILED);
    }

    /**
     * 参数验证失败返回结果
     * @param message 提示信息
     */
    public static <T> com.example.springcloud.common.CommonResult<T> validateFailed(String message) {
        return new com.example.springcloud.common.CommonResult<T>(ResultCode.VALIDATE_FAILED.getCode(), message, null);
    }

    /**
     * 未登录返回结果
     */
    public static <T> com.example.springcloud.common.CommonResult<T> unauthorized(T data) {
        return new com.example.springcloud.common.CommonResult<T>(ResultCode.UNAUTHORIZED.getCode(), ResultCode.UNAUTHORIZED.getMessage(), data);
    }

    /**
     * 未授权返回结果
     */
    public static <T> com.example.springcloud.common.CommonResult<T> forbidden(T data) {
        return new com.example.springcloud.common.CommonResult<T>(ResultCode.FORBIDDEN.getCode(), ResultCode.FORBIDDEN.getMessage(), data);
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
