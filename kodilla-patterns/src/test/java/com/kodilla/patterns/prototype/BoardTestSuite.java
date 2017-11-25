package com.kodilla.patterns.prototype;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class BoardTestSuite {

    @Test
    public void testToString() {
        //Given
        //Create TasksList toDo
        TaskList listToDo = new TaskList("To do Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listToDo.getTasks().add(
                        new Task("To do Task number: " +n)));

        //Create TasksList inProgress
        TaskList listInProgress = new TaskList("In progress Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listInProgress.getTasks().add(new Task("In progress Task number: " + n)));

        //Create TasksList Done
        TaskList listDone = new TaskList("Done Task List");
        IntStream.iterate(1, n-> n + 1)
                .limit(10)
                .forEach(n-> listDone.getTasks().add(new Task("Done Task list")));

        //Create boards
        Board board = new Board("Project number 1");
        board.getLists().add(listToDo);
        board.getLists().add(listInProgress);
        board.getLists().add(listDone);


        //making shallowClone()

        Board clonedBoard = null;
        try {
            clonedBoard = board.shallowCopy();
            clonedBoard.setName("Project number 2 (cloned)");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making the deepCopy()
        Board deepClonedBoard = null;
        try {
            deepClonedBoard = board.deepCopy();
            deepClonedBoard.setName("Project number 3(deep clone");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        board.getLists().remove(listToDo);

        //Then
        System.out.println(board);
        System.out.println(clonedBoard);
        System.out.println(deepClonedBoard);
        Assert.assertEquals(2, board.getLists().size());
        Assert.assertEquals(2, clonedBoard.getLists().size());
        Assert.assertEquals(3, deepClonedBoard.getLists().size());
        Assert.assertEquals(clonedBoard.getLists(), board.getLists());
        Assert.assertNotEquals(deepClonedBoard.getLists(), board.getLists());
    }
}
