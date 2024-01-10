package com.category.tree.application.app.controller;

import com.category.tree.category.feature.core.dto.CreateCategoryRequest;
import com.category.tree.category.feature.core.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CreateCategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("/create")
    void create(@RequestBody CreateCategoryRequest request) {
        categoryService.create(request);
    }
}