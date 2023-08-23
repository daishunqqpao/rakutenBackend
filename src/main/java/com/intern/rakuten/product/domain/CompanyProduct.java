package com.intern.rakuten.product.domain;

import org.springframework.stereotype.Component;

@Component
public class CompanyProduct {
    private Integer companyId;
    private Integer itemId;
    private Integer storage;
    private String itemName;
    private String itemText;
    private String itemImage;

    public CompanyProduct() {
    }

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    public CompanyProduct(Integer storage, Integer companyId, Integer itemId, String itemName, String itemText, String itemImage) {
        this.storage = storage;
        this.companyId = companyId;
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemText = itemText;
        this.itemImage = itemImage;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
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
