package com.kodilla.good.patterns.challengefood;

public class SendOrderInformation implements NewOrderInformation {
    public void sendInfoToSupplier(NewSupplier newSupplier) {
        System.out.println("New Order information send to supplier: "
                + newSupplier.getSupplierName());
    }
}
