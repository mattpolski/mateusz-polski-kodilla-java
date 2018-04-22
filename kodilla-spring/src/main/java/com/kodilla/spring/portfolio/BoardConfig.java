package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class BoardConfig {

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

    @Bean
    public Board board() {
        return new Board(toDoList(), inProgressList(), doneList());
    }
}