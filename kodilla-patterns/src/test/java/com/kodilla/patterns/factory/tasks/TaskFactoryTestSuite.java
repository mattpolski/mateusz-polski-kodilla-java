package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShoppingTask() {
        TaskFactory taskFactory = new TaskFactory();
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);
        shoppingTask.executeTask();
        Assert.assertEquals("Buy fruits", shoppingTask.getTaskName());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        TaskFactory factory = new TaskFactory();
        Task pantingTask = factory.makeTask(TaskFactory.PAINTING);
        Assert.assertEquals("Paint something", pantingTask.getTaskName());
    }

    @Test
    public void testFactoryDrivingTask() {
        TaskFactory factory = new TaskFactory();
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);
        Assert.assertEquals("Drive vehicle", drivingTask.getTaskName());

    }
}
