package com.kodilla.patterns.strategy.publishers;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class PublishByFacebook implements SocialPublisher {
    @Override
    public String share() {
        return "[Facebook connection enabled] Facebook post sent";
    }
}
