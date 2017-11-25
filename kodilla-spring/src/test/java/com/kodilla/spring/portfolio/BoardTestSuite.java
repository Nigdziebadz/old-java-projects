package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getDoneList().tasks.add("Task 1 done");
        board.getInProgressList().tasks.add("Task 2 in progress");
        board.getToDoList().tasks.add("Task 3 to do");

        //Then
        Assert.assertEquals(board.getDoneList().tasks.size(), 1);
        Assert.assertEquals(board.getInProgressList().tasks.size(), 1);
        Assert.assertEquals(board.getToDoList().tasks.size(), 1);
    }
}
