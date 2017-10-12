package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.*;

public class ForumTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: Start");
    }
    @After
    public void after() {
        System.out.println("Test case: end");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test suite: start");
    }
    @Test
    public void testCaseUsername(){
        //Given
        SimpleUser simpleUser = new SimpleUser(
                "theForumUser", "Jan Kowalski");
        //When
        String result = simpleUser.getUsername();
        System.out.println("Testing: " + result);
        //Then
        Assert.assertEquals("theForumUser", result);
    }
    @Test
    public void testCaseRealUserName() {
        SimpleUser simpleUser = new SimpleUser(
                "theForumUser", "Jan Kowalski");
        String result2 = simpleUser.getUserRealName();
        System.out.println("Testing: " + result2);
        Assert.assertEquals("Jan Kowalski", result2);
    }
}