package com.intern.rakuten.product.service;

import com.intern.rakuten.product.domain.CompanyProduct;

import java.util.List;

public interface CompanyProductService {
    void registerCompanyProduct(CompanyProduct companyProduct);
    void consumeCompanyProductByIds(Integer companyId, Integer productId);
    List<CompanyProduct> getAllCompanyProducts();
    List<CompanyProduct> getCompanyProductsByIds(Integer companyId, Integer productId);
}
