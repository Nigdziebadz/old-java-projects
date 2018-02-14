package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String userName;
    private int taskCount;

    public Mentor(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(DiscipleTaskQueue discipleTaskQueue) {
        System.out.println(userName + ": New tasks for user " + discipleTaskQueue.getName()
                + "\n" + " (total: " + discipleTaskQueue.getMessages().size() + " tasks");
        taskCount++;
    }

    public String getUserName() {
        return userName;
    }

    public int getUpdateCount() {
        return taskCount;
    }
}

