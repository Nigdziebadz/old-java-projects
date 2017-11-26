package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.publishers.PublishByFacebook;

public class FacebookPublisher extends User {
    public FacebookPublisher(String name) {
        super(name);
        this.socialpublisher = new PublishByFacebook();
    }
}
