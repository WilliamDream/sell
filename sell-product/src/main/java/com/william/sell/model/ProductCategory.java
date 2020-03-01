package com.william.sell.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Auther: williamdream
 * @Date: 2020/3/1 16:51
 * @Description:
 */
@Entity
@Data
public class ProductCategory {

    @Id
    @GeneratedValue
    private Integer categoryId;

    private String categoryName;

    private String categoryType;

    private Date createTime;

    private Date updateTime;

}
