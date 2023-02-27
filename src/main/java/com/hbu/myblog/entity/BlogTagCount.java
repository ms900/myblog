package com.hbu.myblog.entity;

import lombok.Data;

/**
 * @author vigilr
 * @since 2021/02/24
 */
@Data
public class BlogTagCount {
    private Integer tagId;
    private String tagName;
    private Integer tagCount;
}
