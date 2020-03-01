package com.william.sell.service.impl;

import com.william.sell.common.ProductStatusEnum;
import com.william.sell.model.ProductInfo;
import com.william.sell.repository.ProductInofRepository;
import com.william.sell.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: williamdream
 * @Date: 2020/3/1 17:03
 * @Description:
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInofRepository repository;

    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
