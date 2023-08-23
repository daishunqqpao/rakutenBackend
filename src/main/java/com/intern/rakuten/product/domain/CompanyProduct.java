package com.intern.rakuten.product.domain;

import org.springframework.stereotype.Component;

@Component
public class CompanyProduct {
    private Integer companyId;
    private Integer itemId;
    private String itemName;
    private String itemText;
    private String itemImage;

    public CompanyProduct() {
    }

    public CompanyProduct(Integer companyId, Integer itemId, String itemName, String itemText, String itemImage) {
        this.companyId = companyId;
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemText = itemText;
        this.itemImage = itemImage;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemText() {
        return itemText;
    }

    public void setItemText(String itemText) {
        this.itemText = itemText;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }




}
