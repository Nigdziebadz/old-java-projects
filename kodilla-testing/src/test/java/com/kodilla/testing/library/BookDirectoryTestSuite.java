package com.kodilla.testing.library;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class BookDirectoryTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Tests begins.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("Tests ended");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("starting test #" + testCounter);
    }
//
//    @Test
//    public void testListBooksWithConditionsReturnList() {
//        assertTrue(false);
//    }
//
//    @Test
//    public void testListBooksWithConditionMoreThan20() {
//        assertTrue(false);
//    }
//
//    @Test
//    public void testListBooksWithConditionFragmentShorterThan3() {
//        assertTrue(false);
//    }

}
