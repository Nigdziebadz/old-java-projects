package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public String executeTask() {
        return "Journey begins";
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isTaskExecuted() {
        if (using == null) {
            System.out.println("No free car");
            return false;
        } else {
            return true;
        }
    }
}