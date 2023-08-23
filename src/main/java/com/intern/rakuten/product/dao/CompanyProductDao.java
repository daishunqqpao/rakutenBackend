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
            @Result(property = "itemId",column = "item_id"),
            @Result(property = "storage",column = "storage")
    })
    public List<CompanyProduct> selectAllCompanyProducts();

    @Select("select * from product where company_id=#{companyId} and item_id=#{itemId}")
    @Results({
            @Result(property = "companyId", column = "company_id"),
            @Result(property = "itemName", column = "item_name"),
            @Result(property = "itemText", column = "item_text"),
            @Result(property = "itemImage",column = "item_image"),
            @Result(property = "itemId",column = "item_id"),
            @Result(property = "storage",column = "storage")
    })
    public List<CompanyProduct> selectCompanyProductsByIds(Integer companyId, Integer itemId);

    @Update("update product set storage = storage-1 where company_id=#{companyId} and item_id=#{itemId}")
    public int consumeCompanyProductsByIds(Integer companyId, Integer itemId);





    @Insert("insert into product(company_id, item_name, item_text, item_image,item_id,storage) values(#{companyId}, #{itemName}, #{itemText}, #{itemImage}, #{itemId},#{storage})")
    public int insertCompanyProduct(CompanyProduct companyProduct);


}
