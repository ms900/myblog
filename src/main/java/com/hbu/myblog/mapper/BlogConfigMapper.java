package com.hbu.myblog.mapper;

import com.hbu.myblog.entity.BlogConfig;

import java.util.List;

/**
 * @author vigilr
 * @since 2021/02/25
 */
public interface BlogConfigMapper {
    List<BlogConfig> selectAll();

    BlogConfig selectByPrimaryKey(String configName);

    int updateByPrimaryKeySelective(BlogConfig record);
}
