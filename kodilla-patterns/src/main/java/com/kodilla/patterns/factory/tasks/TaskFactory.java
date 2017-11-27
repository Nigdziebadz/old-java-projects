package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task doTask(final String taskType) {
        switch (taskType) {
            case SHOPPING:
                return new ShoppingTask("Go to the artist shop",
                        "Picture frame", 0);
            case PAINTING:
                return new PaintingTask("Repaint with a new client " +
                        "- to calm him down", "red", "Main room");
            case DRIVING:
                return new DrivingTask("Visit a psychiatrist",
                        "from his house", null);
            default:
                return null;
        }

    }
}