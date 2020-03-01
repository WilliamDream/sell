package com.william.sell.service.impl;

import com.william.sell.model.ProductCategory;
import com.william.sell.repository.ProductCategoryRepository;
import com.william.sell.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: williamdream
 * @Date: 2020/3/1 17:13
 * @Description:
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService{


    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> types) {
        return repository.findByCategoryTypeIn(types);
    }
}
