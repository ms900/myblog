package com.hbu.myblog.entity.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author vigilr
 * @since 2021/02/24
 */
@Data
public class BlogDetailVO {
    private Long blogId;
    private String blogTitle;
    private Integer blogCategoryId;
    private Integer commentCount;
    private String blogCategoryIcon;
    private String blogCategoryName;
    private Long blogViews;
    private List<String> blogTags;
    private String blogContent;
    private Byte enableComment;
    private Date createTime;
}
