package com.kodilla.good.patterns.challenges;

public class User {
    public String name;
    public String surName;

    public User(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }
}
