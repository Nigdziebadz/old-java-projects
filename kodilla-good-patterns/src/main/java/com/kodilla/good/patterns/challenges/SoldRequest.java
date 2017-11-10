package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class SoldRequest {
    public User user;
    public LocalDateTime when;
    public String itemName;
    public int itemQnt;

    public SoldRequest(User user, LocalDateTime when, String itemName, int itemQnt) {
        this.user = user;
        this.when = when;
        this.itemName = itemName;
        this.itemQnt = itemQnt;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getWhen() {
        return when;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemQnt() {
        return itemQnt;
    }
}
