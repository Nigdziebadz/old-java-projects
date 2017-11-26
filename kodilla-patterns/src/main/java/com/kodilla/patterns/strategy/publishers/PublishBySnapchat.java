package com.kodilla.patterns.strategy.publishers;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class PublishBySnapchat implements SocialPublisher {
    @Override
    public String share() {
        return "[Snapchat connection enabled] Snapchat video sent";
    }
}
