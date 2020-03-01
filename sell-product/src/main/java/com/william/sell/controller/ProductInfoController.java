package com.william.sell.controller;

import com.william.sell.model.ProductCategory;
import com.william.sell.model.ProductInfo;
import com.william.sell.service.ProductCategoryService;
import com.william.sell.service.ProductInfoService;
import com.william.sell.vo.ProductInfoVo;
import com.william.sell.vo.ProductVo;
import com.william.sell.vo.ResultVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther: chaiz
 * @Date: 2020/2/29 21:12
 * @Description:
 */
@RequestMapping
@RestController
public class ProductInfoController {

    @Autowired
    private ProductInfoService productInfoService;

    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping
    public void getProductList(){
        List<ProductInfo> productInfoList = productInfoService.findUpAll();
        List<Integer> categoryTypeList =  productInfoList.stream().map(ProductInfo::getCategoryType).collect(Collectors.toList());
        List<ProductCategory> categoryList = productCategoryService.findByCategoryTypeIn(categoryTypeList);
        List<ProductVo> productVoList = new ArrayList<>();
        for (ProductCategory productCategory : categoryList){
            ProductVo productVo = new ProductVo();
            productVo.setCategoryName(productCategory.getCategoryName());
            productVo.setCategoryType(productCategory.getCategoryType());
            List<ProductInfoVo> productInfoVoList = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList){
                if(productCategory.getCategoryType().equals(productInfo.getCategoryType())){
                    ProductInfoVo productInfoVo = new ProductInfoVo();
                    BeanUtils.copyProperties(productInfo,productInfoVo);
                }
            }

            productVo.setProductInfoVoList(productInfoVoList);
            productVoList.add(productVo);
        }
        ResultVo resultVo = new ResultVo();
        resultVo.setData(productInfoList);
        resultVo.setCode(0);
        resultVo.setMessage("ok");
    }
}
