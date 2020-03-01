package com.william.sell.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Auther: williamdream
 * @Date: 2020/3/1 17:24
 * @Description:
 */
@Data
public class ProductInfoVo {

    @JsonProperty("id")
    private Integer productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("descrition")
    private String productContext;

    @JsonProperty("price")
    private BigDecimal productPrice;

}
