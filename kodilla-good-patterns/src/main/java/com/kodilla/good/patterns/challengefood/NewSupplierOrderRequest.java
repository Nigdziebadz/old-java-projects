package com.kodilla.good.patterns.challengefood;

import java.time.LocalDateTime;

public class NewSupplierOrderRequest {
    public NewSupplier newSupplier;
    public LocalDateTime when;


    public NewSupplierOrderRequest(NewSupplier newSupplier, LocalDateTime when) {
        this.newSupplier = newSupplier;
        this.when = when;
    }

    public NewSupplier getNewSupplier() {
        return newSupplier;
    }

    public LocalDateTime getWhen() {
        return when;
    }

}
