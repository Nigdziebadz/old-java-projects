package com.kodilla.good.patterns.challengefood;

import java.time.LocalDateTime;

public class NewOrderService implements NewOrder {
    public boolean createOrder(NewSupplier newSupplier, LocalDateTime when) {

        System.out.println("Dnia " + when.toString() + " zamowiono "
                + newSupplier.typeOfProduct + " " + " w ilości: " + newSupplier.itemQnt +
                " od producenta " + newSupplier.supplierName);
        return true;
    }
}

