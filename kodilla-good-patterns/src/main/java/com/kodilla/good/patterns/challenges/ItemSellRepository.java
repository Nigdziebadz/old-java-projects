package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ItemSellRepository implements SellRepository {
    public boolean createTransaction(User user, LocalDateTime when, String itemName, int itemQnt) {
        return true;
    }
}
