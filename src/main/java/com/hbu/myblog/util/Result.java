package com.hbu.myblog.util;

import lombok.Data;

import java.io.Serializable;

/**
 * 返回结果
 *
 * @author vigilr
 * @since 2021/02/24
 */
@Data
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private int resultCode;
    private String message;
    private T data;

    public Result() {
    }

    public Result(int resultCode, String message) {
        this.resultCode = resultCode;
        this.message = message;
    }


}

