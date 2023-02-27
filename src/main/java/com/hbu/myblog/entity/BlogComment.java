package com.hbu.myblog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author vigilr
 * @since 2021/02/24
 */
@Data
public class BlogComment {
    private Long commentId;
    private Long blogId;
    private String commentator;
    private String email;
    private String websiteUrl;
    private String commentBody;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT")
    private Date commentCreateTime;
    private String commentatorIp;
    private String replyBody;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT")
    private Date replyCreateTime;
    private Byte commentStatus;
    private Byte isDeleted;
}
