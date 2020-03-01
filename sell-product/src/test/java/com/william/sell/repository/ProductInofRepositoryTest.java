package com.william.sell.repository;

import com.william.sell.model.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auther: williamdream
 * @Date: 2020/3/1 16:41
 * @Description:
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest
public class ProductInofRepositoryTest {

    @Autowired
    private ProductInofRepository productInofRepository;
    @Test
    public void findByProductStatus() throws Exception {
        List<ProductInfo> list = productInofRepository.findByProductStatus(0);
        Assert.assertTrue(list.size()>0);
    }

}