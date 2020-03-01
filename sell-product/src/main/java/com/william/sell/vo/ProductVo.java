package com.william.sell.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @Auther: chaiz
 * @Date: 2020/3/1 17:21
 * @Description:
 */

@Data
public class ProductVo {

    @JsonProperty("name")
    private String categoryName;


    @JsonProperty("type")
    private String categoryType;

    @JsonProperty("foods")
    List<ProductInfoVo> productInfoVoList;

}
