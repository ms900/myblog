package com.hbu.myblog.entity;

import lombok.Data;

/**
 * @author vigilr
 * @since 2021/02/24
 */
@Data
public class AdminUser {
    private Integer adminUserId;
    private String loginUserName;
    private String loginPassword;
    private String nickName;
    private Byte locked;
}
