package com.william.sell.vo;

import lombok.Data;

/**
 * @Auther: williamdream
 * @Date: 2020/3/1 17:18
 * @Description:
 */

@Data
public class ResultVo<T> {

    private Integer code = 0;

    private String message;

    private T data;

}
