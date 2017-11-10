package com.kodilla.good.patterns.challenges;

public class SellDto {
    public User user;
    public boolean isSold;

    public SellDto(final User user, final boolean isSold) {
        this.user = user;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

    public boolean isSold() {
        return isSold;
    }
}