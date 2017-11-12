package com.kodilla.good.patterns.challengefood;

public class NewSupplier {
    String supplierName;
    String typeOfProduct;
    int itemQnt;

    public NewSupplier(String supplierName, String typeOfProduct, int itemQnt) {
        this.supplierName = supplierName;
        this.typeOfProduct = typeOfProduct;
        this.itemQnt = itemQnt;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public int getItemQnt() {
        return itemQnt;
    }
}
