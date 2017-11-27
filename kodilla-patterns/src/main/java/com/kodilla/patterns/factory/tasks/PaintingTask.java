package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }

    public String executeTask() {
        return "Painting started";
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isTaskExecuted() {
        if (whatToPaint == null) {
            return false;
        }
        return true;
    }
}

