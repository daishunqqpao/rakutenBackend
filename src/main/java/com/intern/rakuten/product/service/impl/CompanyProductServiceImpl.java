package com.intern.rakuten.product.service.impl;

import com.intern.rakuten.product.dao.CompanyProductDao;
import com.intern.rakuten.product.service.CompanyProductService;
import com.intern.rakuten.product.domain.CompanyProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompanyProductServiceImpl implements CompanyProductService {

    @Autowired
    private CompanyProductDao companyProductDao;

    @Override
    public void registerCompanyProduct(CompanyProduct companyProduct){
        companyProductDao.insertCompanyProduct(companyProduct);
    }

    @Override
    public List<CompanyProduct> getAllCompanyProducts(){
        return companyProductDao.selectAllCompanyProducts();
    }

}
