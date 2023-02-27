package com.hbu.myblog.service;

import com.hbu.myblog.entity.BlogCategory;
import com.hbu.myblog.util.PageQueryUtil;
import com.hbu.myblog.util.PageResult;

import java.util.List;

/**
 * @author vigilr
 * @since 2021/02/24
 */
public interface CategoryService {

    /**
     * 查询分类的分页数据
     *
     * @param pageUtil
     * @return
     */
    PageResult getBlogCategoryPage(PageQueryUtil pageUtil);

    int getTotalCategories();

    /**
     * 添加分类数据
     *
     * @param categoryName
     * @param categoryIcon
     * @return
     */
    Boolean saveCategory(String categoryName,String categoryIcon);

    Boolean updateCategory(Integer categoryId, String categoryName, String categoryIcon);

    Boolean deleteBatch(Integer[] ids);

    List<BlogCategory> getAllCategories();
}

