package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.publishers.PublishByTwitter;

public class TwitterPublisher extends User{
    public TwitterPublisher(String name) {
        super(name);
        this.socialpublisher = new PublishByTwitter();
    }
}

