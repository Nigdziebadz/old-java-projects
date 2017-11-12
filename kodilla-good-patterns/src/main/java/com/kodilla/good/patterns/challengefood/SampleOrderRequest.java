package com.kodilla.good.patterns.challengefood;

import java.time.LocalDateTime;

public class SampleOrderRequest {
    public NewSupplier newSupplier;
    public LocalDateTime when;

    public SampleOrderRequest(NewSupplier newSupplier, LocalDateTime when) {
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
