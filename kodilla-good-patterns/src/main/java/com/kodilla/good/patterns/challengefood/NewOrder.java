package com.kodilla.good.patterns.challengefood;

import java.time.LocalDateTime;

public interface NewOrder {
    boolean createOrder(NewSupplier newSupplier, LocalDateTime when);
}

