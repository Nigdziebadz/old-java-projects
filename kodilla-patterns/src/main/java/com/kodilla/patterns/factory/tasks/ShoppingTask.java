package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public String executeTask() {
        return "Shopping task started";
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isTaskExecuted() {
        if (quantity == 0) {
            System.out.println("Zero quantinty, shopping cancelled");
            return false;
        } else {
            return true;
        }
    }
}
