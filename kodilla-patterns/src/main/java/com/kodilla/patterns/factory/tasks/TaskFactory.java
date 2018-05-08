package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Buy fruits", "Apples", 2.0);
            case PAINTING:
                return new PaintingTask("Paint something", "Yellow", "Children's room");
            case DRIVING:
                return new DrivingTask("Drive vehicle", "Boston", "Car");
            default:
                return null;
        }
    }
}
