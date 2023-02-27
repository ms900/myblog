package com.hbu.myblog.entity.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author vigilr
 * @since 2021/02/24
 */
@Data
public class SimpleBlogListVO implements Serializable {
    private Long blogId;
    private String blogTitle;
}
