package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.publishers.PublishByTwitter;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User johnFace = new FacebookPublisher("Hide ur face");
        User emiliaTwitter = new TwitterPublisher("Mrs Ask Me 256 times");
        User alekSnap = new SnapchatPublisher("Chat and Snap");

        //When
        String facePublish = johnFace.sharePost();
        System.out.println("Media selected: " + facePublish);
        String twitterPublish = emiliaTwitter.sharePost();
        System.out.println("Media selected: " + twitterPublish);
        String snapchatPublish = alekSnap.sharePost();
        System.out.println("Media selected: " + snapchatPublish);

        //Then
        Assert.assertEquals("[Facebook connection enabled] Facebook post sent",
                facePublish);
        Assert.assertEquals("[Snapchat connection enabled] Snapchat video sent",
                snapchatPublish);
        Assert.assertEquals("[Twitter connection enabled] Twitter post sent",
                twitterPublish);
    }
        @Test
        public void testIndividualSharingStrategy() {
            //Given
            User notSoSureSteven = new FacebookPublisher("Random Media Clicker");

            //When
            String areUSureSteven = notSoSureSteven.sharePost();
            System.out.println("Media selected: " + areUSureSteven);
            notSoSureSteven.setPublishMethod(new PublishByTwitter());
            areUSureSteven = notSoSureSteven.sharePost();
            System.out.println("Media changed, now using: " + areUSureSteven);

            //Then
            Assert.assertEquals("[Twitter connection enabled] Twitter post sent", areUSureSteven);
        }
    }
