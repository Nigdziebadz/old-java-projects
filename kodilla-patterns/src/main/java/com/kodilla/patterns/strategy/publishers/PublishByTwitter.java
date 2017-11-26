package com.kodilla.patterns.strategy.publishers;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class PublishByTwitter implements SocialPublisher {
    @Override
    public String share() {
        return "[Twitter connection enabled] Twitter post sent";
    }
}
