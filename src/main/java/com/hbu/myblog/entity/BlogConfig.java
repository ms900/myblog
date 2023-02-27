package com.hbu.myblog.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author vigilr
 * @since 2021/02/24
 */
@Data
public class BlogConfig {
    private String configName;
    private String configValue;
    private Date createTime;
    private Date updateTime;
}
