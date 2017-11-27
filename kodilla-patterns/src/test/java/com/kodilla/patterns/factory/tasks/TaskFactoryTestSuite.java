package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.doTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals(shopping.isTaskExecuted(), false);
        Assert.assertEquals("Go to the artist shop", shopping.getTaskName());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.doTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals(painting.isTaskExecuted(), true);
        Assert.assertEquals("Repaint with a new client " +
                "- to calm him down", painting.getTaskName());
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.doTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals(driving.isTaskExecuted(), false);
        Assert.assertEquals("Visit a psychiatrist", driving.getTaskName());
    }
}
