package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    Board board;

    @Bean(name = "tasksToDo")
    public TaskList toDoList() {
        return new TaskList();
    }

    @Bean(name = "tasksInProgress")
    public TaskList inProgressList() {
        return new TaskList();
    }

    @Bean(name = "tasksDone")
    public TaskList doneList() {
        return new TaskList();
    }
}