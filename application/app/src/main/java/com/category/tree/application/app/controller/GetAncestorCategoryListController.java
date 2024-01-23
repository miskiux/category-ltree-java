package com.category.tree.application.app.controller;

import com.category.tree.category.feature.core.entity.Category;
import com.category.tree.category.feature.core.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GetAncestorCategoryListController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/category/{name}")
    List<Category> getAncestorList(@PathVariable String name) {
        return categoryService.getAncestorList(name);
    }
}