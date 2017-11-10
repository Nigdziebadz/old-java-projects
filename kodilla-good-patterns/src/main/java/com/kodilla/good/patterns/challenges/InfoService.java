package com.kodilla.good.patterns.challenges;

public class InfoService implements SellInfoService {
    public void sendInfo(User user) {
        System.out.println("Item sold to: "
                + user.getName() + " " + user.getSurName());
    }
}