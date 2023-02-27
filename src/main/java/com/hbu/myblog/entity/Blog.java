package com.hbu.myblog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author vigilr
 * @since 2021/02/24
 */
@Data
public class Blog {
    private Long blogId;
    private String blogTitle;
    private String blogSummary;
    private Integer blogCategoryId;
    private String blogCategoryName;
    private String blogTags;
    private Byte blogStatus;
    private Long blogViews;
    private Byte enableComment;
    private Byte isDeleted;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT")
    private Date createTime;
    private Date updateTime;

    private String blogContent;

}
