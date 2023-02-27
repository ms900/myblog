package com.hbu.myblog.entity.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author vigilr
 * @since 2021/02/24
 */
@Data
public class BlogListVO implements Serializable {
    private Long blogId;

    private String blogTitle;

    private String blogSummary;

    private Integer blogCategoryId;

    private String blogCategoryIcon;

    private String blogCategoryName;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT")
    private Date createTime;
}
