package com.william.sell.repository;

import com.william.sell.model.ProductInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Auther: willimadream
 * @Date: 2020/3/1 16:27
 * @Description:
 */
@Mapper
public interface ProductInofRepository extends JpaRepository<ProductInfo,Integer>{

    List<ProductInfo> findByProductStatus(Integer productStatus);


}
