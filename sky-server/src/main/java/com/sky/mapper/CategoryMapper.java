package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CategoryMapper {

@Insert("insert into category (type, name, sort, status, create_time, update_time, create_user, update_user) " +
        "values " +
         "( #{type}, #{name}, #{sort}, #{status}, #{create_time},#{update_time},#{create_user},#{update_user})")
    void insert(Category category) ;
@Select("select * from category where name=#{name}")
    Page<Category> select(CategoryPageQueryDTO categoryPageQueryDTO);
    @Select("select * from category where type=#{type}")
    Category typequery(Integer type);
}
