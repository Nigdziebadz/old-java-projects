package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ItemSellService implements SellService{
    public boolean createTransaction(User user, LocalDateTime when, String itemName, int itemQnt) {

        System.out.println("Uzytkownik " + user.getName() + " " + user.getSurName()
                + " kupił: " + itemName + ", " + " w ilości: " + itemQnt + ", dnia " + when.toString());
        return true;
    }
}
