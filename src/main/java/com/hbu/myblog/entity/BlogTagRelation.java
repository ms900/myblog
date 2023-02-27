package com.hbu.myblog.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author vigilr
 * @since 2021/02/24
 */
@Data
public class BlogTagRelation {
    private Long relationId;
    private Long blogId;
    private Integer tagId;
    private Date createTime;
}
