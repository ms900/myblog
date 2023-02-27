package com.hbu.myblog.service;

import com.hbu.myblog.entity.BlogTagCount;
import com.hbu.myblog.util.PageQueryUtil;
import com.hbu.myblog.util.PageResult;

import java.util.List;

/**
 * @author vigilr
 * @since 2021/02/24
 */
public interface TagService {
    PageResult getBlogTagPage(PageQueryUtil pageUtil);

    int getTotalTags();

    Boolean saveTag(String tagName);

    Boolean deleteBatch(Integer[] ids);

    List<BlogTagCount> getBlogTagCountForIndex();
}
