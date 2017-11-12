package com.kodilla.good.patterns.challengefood;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public NewSupplierOrderRequest retrieve() {

        NewSupplier newSupplier = new NewSupplier("GlutenFreeShop",
                "GlutenFree HairCut for the go!", 21);
        LocalDateTime when = LocalDateTime.of(2017, 11, 10, 10, 44);

        return new NewSupplierOrderRequest(newSupplier, when);
    }
}