package com.intern.rakuten.product;

import com.intern.rakuten.product.dao.CompanyProductDao;
import com.intern.rakuten.product.domain.CompanyProduct;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProductApplicationTests {
    @Autowired
    private CompanyProductDao companyProductDao;
    @Test
    void contextLoads() {
    }
    @Test
    void testRegisterCompanyProduct()
    {
        CompanyProduct test = new CompanyProduct(8,8,5,"aaa","aaa","aaa");
        companyProductDao.insertCompanyProduct(test);
    }

    @Test
    void testSelectCompanyProduct()
    {
        List<CompanyProduct> cps = companyProductDao.selectAllCompanyProducts();
    }

    @Test
    void testDeleteProduct()
    {
        companyProductDao.consumeCompanyProductsByIds(1,1);
    }

    @Test
    void testSelectByIds()
    {
        for(CompanyProduct cp: companyProductDao.selectCompanyProductsByIds(1,1))
        {
            System.out.println(cp.getStorage());
        }
    }
}
