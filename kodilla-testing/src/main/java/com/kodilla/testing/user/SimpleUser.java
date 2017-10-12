package com.kodilla.testing.user;

public class SimpleUser {
    private String username;
    private String userRealName;

    public SimpleUser(String username, String userRealName) {
        this.username = username;
        this.userRealName = userRealName;
    }
    public String getUsername() {
        return username;
    }
    public String getUserRealName() {
        return userRealName;
    }
}