package com.kodilla.good.patterns.challengefood;

public class SupplierOrderDto {
    public NewSupplier newSupplier;
    public boolean gotNewOrder;

    public SupplierOrderDto(NewSupplier newSupplier, boolean gotNewOrder) {
        this.newSupplier = newSupplier;
        this.gotNewOrder = gotNewOrder;
    }

    public NewSupplier getNewSupplier() {
        return newSupplier;
    }

    public boolean gotNewOrder() {
        return gotNewOrder;
    }
}