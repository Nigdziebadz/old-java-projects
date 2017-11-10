package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class TransactionRequestRetriever {
    public SoldRequest retrieve() {

        User user = new User("Alek", "LockHart");
        LocalDateTime when = LocalDateTime.of(2017, 11, 10, 10, 44);
        String itemName = "Uniwersalny Zaginacz Czasu - \"Hope this shit works\"";
        int itemQnt = 1;

        return new SoldRequest(user, when, itemName, itemQnt);
    }

}