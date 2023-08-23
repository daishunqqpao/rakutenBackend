package com.intern.rakuten.product.service;

import com.intern.rakuten.product.domain.CompanyProduct;

import java.util.List;

public interface CompanyProductService {
    void registerCompanyProduct(CompanyProduct companyProduct);
    List<CompanyProduct> getAllCompanyProducts();
}
