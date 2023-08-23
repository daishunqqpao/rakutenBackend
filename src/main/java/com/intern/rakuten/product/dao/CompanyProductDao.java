package com.intern.rakuten.product.dao;

import com.intern.rakuten.product.domain.CompanyProduct;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CompanyProductDao {
    @Select("select * from product")
    @Results({
            @Result(property = "companyId", column = "company_id"),
            @Result(property = "itemName", column = "item_name"),
            @Result(property = "itemText", column = "item_text"),
            @Result(property = "itemImage",column = "item_image"),
            @Result(property = "itemId",column = "item_id")
    })
    public List<CompanyProduct> selectAllCompanyProducts();

    @Insert("insert into product(company_id, item_name, item_text, item_image,item_id) values(#{companyId}, #{itemName}, #{itemText}, #{itemImage}, #{itemId})")
    public int insertCompanyProduct(CompanyProduct companyProduct);
}
