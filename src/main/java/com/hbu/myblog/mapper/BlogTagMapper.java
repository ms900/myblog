package com.hbu.myblog.mapper;

import com.hbu.myblog.entity.BlogTag;
import com.hbu.myblog.entity.BlogTagCount;
import com.hbu.myblog.util.PageQueryUtil;

import java.util.List;

/**
 * @author vigilr
 * @since 2021/02/25
 */
public interface BlogTagMapper {
    int deleteByPrimaryKey(Integer tagId);

    int insert(BlogTag record);

    int insertSelective(BlogTag record);

    BlogTag selectByPrimaryKey(Integer tagId);

    BlogTag selectByTagName(String tagName);

    int updateByPrimaryKeySelective(BlogTag record);

    int updateByPrimaryKey(BlogTag record);

    List<BlogTag> findTagList(PageQueryUtil pageUtil);

    List<BlogTagCount> getTagCount();

    int getTotalTags(PageQueryUtil pageUtil);

    int deleteBatch(Integer[] ids);

    int batchInsertBlogTag(List<BlogTag> tagList);
}