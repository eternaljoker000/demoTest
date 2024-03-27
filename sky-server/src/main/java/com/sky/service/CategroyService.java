package com.sky.service;

import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import com.sky.result.PageResult;


public interface CategroyService {
    void addcategory(CategoryDTO categoryDTO);

    PageResult pagequery(CategoryPageQueryDTO categoryPageQueryDTO);


    Category typequery(Integer type);
}
