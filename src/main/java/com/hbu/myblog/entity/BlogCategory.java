package com.hbu.myblog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author vigilr
 * @since 2021/02/24
 */
@Data
public class BlogCategory {
    private Integer categoryId;
    private String categoryName;
    private String categoryIcon;
    private Integer categoryRank;
    private Byte isDeleted;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT")
    private Date createTime;
}
