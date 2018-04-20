package com.kodilla.spring.portfolio;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getToDoList().addTask("Task number 1");
        board.getInProgressList().addTask("Task number 2");
        board.getDoneList().addTask("Task number 3");

        String task1 = board.getToDoList().getTask(0);
        String task2 = board.getInProgressList().getTask(0);
        String task3 = board.getDoneList().getTask(0);

        Assert.assertEquals(task1, "Task number 1");
        Assert.assertEquals(task2, "Task number 2");
        Assert.assertEquals(task3, "Task number 3");

    }
}
