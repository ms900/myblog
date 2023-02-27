package com.hbu.myblog.util;

import org.springframework.util.StringUtils;

/**
 * @author vigilr
 * @since 2021/02/24
 */
public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";
    private static final String DEFAULT_FAIL_MESSAGE = "FAIL";
    private static final int RESULT_CODE_SUCCESS = 200;
    private static final int RESULT_CODE_SERVER_ERROR = 500;

    /**
     * 返回成功的结果
     *
     * @return com.hbu.myblog.util.Result
     */
    public static Result genSuccessResult() {
        Result result = new Result();
        result.setResultCode(RESULT_CODE_SUCCESS);
        result.setMessage(DEFAULT_SUCCESS_MESSAGE);
        return result;
    }

    /**
     * 返回成功的结果
     *
     * @param message 成功的消息
     * @return com.hbu.myblog.util.Result
     */
    public static Result genSuccessResult(String message) {
        Result result = new Result();
        result.setResultCode(RESULT_CODE_SUCCESS);
        result.setMessage(message);
        return result;
    }

    /**
     * 返回成功的结果
     *
     * @param data 需要传入的值
     * @return com.hbu.myblog.util.Result
     */
    public static Result genSuccessResult(Object data) {
        Result result = new Result();
        result.setResultCode(RESULT_CODE_SUCCESS);
        result.setMessage(DEFAULT_SUCCESS_MESSAGE);
        result.setData(data);
        return result;
    }

    /**
     * 返回失败的结果
     *
     * @param message 失败的消息
     * @return com.hbu.myblog.util.Result
     */
    public static Result genFailResult(String message) {
        Result result = new Result();
        result.setResultCode(RESULT_CODE_SERVER_ERROR);
        if (StringUtils.isEmpty(message)) {
            result.setMessage(DEFAULT_FAIL_MESSAGE);
        } else {
            result.setMessage(message);
        }
        return result;
    }

    /**
     * 返回错误的结果
     *
     * @param code    错误状态码
     * @param message 错误的消息
     * @return com.hbu.myblog.util.Result
     */
    public static Result genErrorResult(int code, String message) {
        Result result = new Result();
        result.setResultCode(code);
        result.setMessage(message);
        return result;
    }
}
