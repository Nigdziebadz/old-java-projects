package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> newUndividedList = new ArrayList<>();
        OddNumbersExterminator ext = new OddNumbersExterminator();
        //When
        List<Integer> newdividedList =
                ext.exterminate(newUndividedList);
        //Then
        System.out.println("Testing empty list");
        assertEquals(0, newdividedList.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> newUndividedList = new ArrayList<>();
        newUndividedList.add(1);
        newUndividedList.add(3);
        newUndividedList.add(5);
        newUndividedList.add(6);
        OddNumbersExterminator run = new OddNumbersExterminator();
        //When
        List<Integer> newdividedList =
                run.exterminate(newUndividedList);
        //Then
        System.out.println("Testing list for odd and even numbers");
        assertEquals(1, newdividedList.size());
    }
}
