package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class TaskListTestSuite {

    @Test
    public void testUpdate() {
        //Given
        DiscipleTaskQueue janKowalskiTaskQue = new JanKowalskiTaskQue();
        DiscipleTaskQueue johnSmithTaskQue = new JohnSmithTaskQue();
        Mentor mentorA = new Mentor("Mentor A");
        Mentor mentorB = new Mentor("Mentor B");
        janKowalskiTaskQue.registerObserver(mentorA);
        janKowalskiTaskQue.registerObserver(mentorB);
        johnSmithTaskQue.registerObserver(mentorB);
        //When
        janKowalskiTaskQue.addTask("The content of the test task number 1");
        janKowalskiTaskQue.addTask("The content of the test task number 2");
        johnSmithTaskQue.addTask("The content of the test task number 3");
        janKowalskiTaskQue.addTask("The content of the test task number 11");
        johnSmithTaskQue.addTask("The content of the test task number 22");
        //Then
        Assert.assertEquals(3, mentorA.getUpdateCount());
        Assert.assertEquals(5, mentorB.getUpdateCount());

    }
}
