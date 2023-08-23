package com.intern.rakuten.product.controller;

import com.intern.rakuten.product.service.CompanyProductService;
import com.intern.rakuten.product.domain.CompanyProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companyproducts")
public class CompanyProductController {
    @Autowired
    CompanyProductService companyProductService;

    @GetMapping
    public List<CompanyProduct> getAllProducts(){
        return companyProductService.getAllCompanyProducts();
    }

    @PostMapping
    public void getAllProducts(@RequestBody CompanyProduct companyProduct){
       companyProductService.registerCompanyProduct(companyProduct);
    }




}
