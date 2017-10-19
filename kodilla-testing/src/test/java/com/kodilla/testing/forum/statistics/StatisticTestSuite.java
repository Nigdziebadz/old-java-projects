//package com.kodilla.testing.forum.statistics;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//public class StatisticTestSuite {
//
//    @Test
//    public void testAvgs1000Posts() {
//        //Given
//        Statistics statisticsMock = mock(Statistics.class);
//        when(statisticsMock.postsCount()).thenReturn(1000);
//        List<String> users = new ArrayList<>();
//        users.add("user1");
//        users.add("User2");
//        when(statisticsMock.usersNames()).thenReturn(users);
//        when(statisticsMock.commentsCount()).thenReturn(100);
//        CalculateForumStatistic calculate =
//                new CalculateForumStatistic(statisticsMock);
//
//        //When
//        calculate.calculateAdvStatistics();
//
//        //Then
//        Assert.assertEquals(2, calculate.getUserQty());
//        Assert.assertEquals(0.1, calculate.getCommentPerPost(), 0);
//    }
//
//    @Test
//    public void testZeroUsers() {
//        //Given
//        Statistics statisticsMock = mock(Statistics.class);
//        when(statisticsMock.postsCount()).thenReturn(50);
//        List<String> users = new ArrayList<>();
//        when(statisticsMock.usersNames()).thenReturn(users);
//        CalculateForumStatistic calculate =
//                new CalculateForumStatistic((statisticsMock));
//
//        //When
//        calculate.calculateAdvStatistics();
//
//        //Then
//        Assert.assertEquals(0, calculate.getUserQty());
//        Assert.assertEquals(0, calculate.getCommentPerPost(), 0);
//    }
//
//    @Test
//    public void testMorePostThenComments() {
//        //Given
//        Statistics statisticsMock = mock(Statistics.class);
//        when(statisticsMock.commentsCount()).thenReturn(1000);
//        List<String> users = new ArrayList<>();
//        users.add("user1");
//        users.add("user2");
//        when(statisticsMock.usersNames()).thenReturn(users);
//        when(statisticsMock.postsCount()).thenReturn(100);
//        CalculateForumStatistic calculate =
//                new CalculateForumStatistic(statisticsMock);
//
//        //When
//        calculate.calculateAdvStatistics();
//
//        //Then
//        Assert.assertEquals(2, calculate.getUserQty());
//        Assert.assertEquals(10, calculate.getCommentPerPost(), 0);
//        Assert.assertEquals(50, calculate.getPostPerUser(), 0);
//    }
//
//    @Test
//    public void testMoreCommentsThenPost() {
//        //Given
//        Statistics statisticsMock = mock(Statistics.class);
//        when(statisticsMock.commentsCount()).thenReturn(100);
//        List<String> users = new ArrayList<>();
//        users.add("user1");
//        users.add("user2");
//        when(statisticsMock.usersNames()).thenReturn(users);
//        when(statisticsMock.postsCount()).thenReturn(1000);
//        CalculateForumStatistic calculate =
//                new CalculateForumStatistic(statisticsMock);
//
//        //When
//        calculate.calculateAdvStatistics();
//
//        //Then
//        Assert.assertEquals(2, calculate.getUserQty());
//        Assert.assertEquals(0.1, calculate.getCommentPerPost(), 0);
//        Assert.assertEquals(50, calculate.getCommentPerUser(), 0);
//    }
//
//    @Test
//    public void testZeroPostZeroComments() {
//        //Given
//        Statistics statisticsMock = mock(Statistics.class);
//        when(statisticsMock.commentsCount()).thenReturn(0);
//        when(statisticsMock.postsCount()).thenReturn(0);
//        List<String> users = new ArrayList<>();
//        users.add("user1");
//        users.add("user2");
//        when(statisticsMock.usersNames()).thenReturn(users);
//        CalculateForumStatistic calculate =
//                new CalculateForumStatistic(statisticsMock);
//
//        //When
//        calculate.calculateAdvStatistics();
//
//        //Then
//        Assert.assertEquals(2, calculate.getUserQty());
//        Assert.assertEquals(0, calculate.getCommentPerUser(), 0);
//        Assert.assertEquals(0, calculate.getPostPerUser(), 0);
//        Assert.assertEquals(0, calculate.getCommentPerPost(), 0);
//    }
//
//    @Test
//    public void testOneHundredUsers() {
//
//        //Given
//        Statistics statisticsMock = mock(Statistics.class);
//        when(statisticsMock.postsCount()).thenReturn(2000);
//        when(statisticsMock.commentsCount()).thenReturn(1000);
//        List<String> users = new ArrayList<>();
//        for (int i = 0; i < 100; i++) {
//            users.add("[user" + i + "]");
//        }
//        when(statisticsMock.usersNames()).thenReturn(users);
//        CalculateForumStatistic calculate =
//                new CalculateForumStatistic(statisticsMock);
//
//        //When
//        calculate.calculateAdvStatistics();
//
//        //Then
//        Assert.assertEquals(100, calculate.getUserQty());
//        Assert.assertEquals(10, calculate.getCommentPerUser(), 0);
//        Assert.assertEquals(20, calculate.getPostPerUser(), 0);
//
//    }
//}
//
