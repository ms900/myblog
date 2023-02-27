package com.hbu.myblog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author vigilr
 * @since 2021/02/24
 */
@Data
public class BlogTag {
    private Integer tagId;
    private String tagName;
    private Byte isDeleted;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT")
    private Date createTime;
}
