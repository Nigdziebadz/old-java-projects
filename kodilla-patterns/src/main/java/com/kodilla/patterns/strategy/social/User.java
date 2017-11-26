package com.kodilla.patterns.strategy.social;

public class User {
    final private String name;
    protected SocialPublisher socialpublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String sharePost() {
        return socialpublisher.share();
    }

    public void setPublishMethod(SocialPublisher socialpublisher) {
        this.socialpublisher = socialpublisher;
    }
}
