package com.kodilla.patterns2.observer.forum;

import org.junit.Assert;
import org.junit.Test;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser janKowalski = new ForumUser("Jan Kowalski");
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser pabloEscobar = new ForumUser("Pablo Escobar");
        javaHelpForum.registerObserver(janKowalski);
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(pabloEscobar);
        javaToolsForum.registerObserver(janKowalski);
        //When
        javaHelpForum.addPost("Hi, could you help mi with post?");
        javaHelpForum.addPost("Use while loop");
        javaHelpForum.addPost("Third post, got enough");
        javaToolsForum.addPost("Seriously, another and iam gone");
        javaToolsForum.addPost("Ok, thats the last one, have enough");
        //Then
        Assert.assertEquals(5, janKowalski.getUpdateCount());
        Assert.assertEquals(2, pabloEscobar.getUpdateCount());
        Assert.assertEquals(3, johnSmith.getUpdateCount());
    }
}
