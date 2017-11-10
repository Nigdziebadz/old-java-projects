package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface SellService {
    boolean createTransaction(User user, LocalDateTime when, String itemName, int itemQnt);
}