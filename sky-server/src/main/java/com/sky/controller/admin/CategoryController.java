package com.sky.controller.admin;

import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import com.sky.result.PageResult;
import com.sky.result.Result;
import com.sky.service.CategroyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/category")
@Slf4j
public class CategoryController {

    @Autowired
    private CategroyService categroyService;
    @PostMapping("")
    public Result addcategory(CategoryDTO categoryDTO) {
        log.info("新增分类:{}", categoryDTO);
        categroyService.addcategory(categoryDTO);
        return Result.success();
    }

    @GetMapping("/page")
    public Result<PageResult> pagequery(CategoryPageQueryDTO categoryPageQueryDTO){
        log.info("分页查询");
        PageResult pageResult =categroyService.pagequery(categoryPageQueryDTO);
        return Result.success( pageResult );
    }
    @GetMapping("/list")
    public Result<Category> typequery(Integer type){
        log.info("类型查询");
        Category category=categroyService.typequery(type);
return Result.success(category);
    }


}
