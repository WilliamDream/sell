package com.william.sell.common;

import lombok.Getter;

/**
 * @Auther: williamdream
 * @Date: 2020/3/1 17:05
 * @Description:
 */
@Getter
public enum  ProductStatusEnum {


    UP(0,"上架"),
    DOWN(1,"下架"),
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
