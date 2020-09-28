package com.zhangyi.white.service;


import com.zhangyi.white.dao.CategoryDAO;
import com.zhangyi.white.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryDAO categoryDAO;

    public List<Category> list(){
        return categoryDAO.findAll();
    }

    public Category get(int id){
        Category category = categoryDAO.findById(id).orElse(null);
        return category;
    }


}
