package com.william.sell.service;

import com.william.sell.model.ProductCategory;

import java.util.List;

/**
 * @Auther: williamdream
 * @Date: 2020/3/1 17:10
 * @Description:
 */
public interface ProductCategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> types);
}
