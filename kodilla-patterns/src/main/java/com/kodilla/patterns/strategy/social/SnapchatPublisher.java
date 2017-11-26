package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.publishers.PublishBySnapchat;

public class SnapchatPublisher extends User {
    public SnapchatPublisher(String name) {
        super(name);
        this.socialpublisher = new PublishBySnapchat();
    }
}
