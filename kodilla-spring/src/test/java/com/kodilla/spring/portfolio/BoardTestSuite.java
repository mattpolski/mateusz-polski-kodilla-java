package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    Board board;

    @Test
    public void testTaskAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getToDoList().addTask("Task number 1");
        board.getInProgressList().addTask("Task number 2");
        board.getDoneList().addTask("Task number 3");

        String toDo = board.getToDoList().getTask(0);
        String inProgress = board.getInProgressList().getTask(0);
        String done = board.getDoneList().getTask(0);

        Assert.assertEquals(toDo, "Task number 1");
        Assert.assertEquals(inProgress, "Task number 2");
        Assert.assertEquals(done, "Task number 3");

    }
}
