package com.william.sell.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther: williamdream
 * @Date: 2020/3/1 16:19
 * @Description:
 */
@Entity
@Data
public class ProductInfo {

    @Id
    @GeneratedValue
    private Integer productId;

    private String productName;

    private BigDecimal productPrice;

    private String productContext;

    private Integer productStatus;

    private Integer categoryType;

    private Date createTime;

    private Date updateTime;



}
