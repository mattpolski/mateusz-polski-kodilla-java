package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    void addTask (String task) {
        tasks.add(task);
    }

    String getTask(int index) {
        return tasks.get(index);
    }
}
