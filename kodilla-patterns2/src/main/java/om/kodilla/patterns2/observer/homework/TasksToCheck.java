package om.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TasksToCheck implements Observable {
    private final List<Observer> observers;
    private final List<Task> tasks;
    private final String name;

    public TasksToCheck(String name) {
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }

    public void addTask(Task task) {
        tasks.add(task);
        notifyObserves();
    }

    @Override
    public void registerMentor(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserves() {
        for (Observer observer : observers) {
            observer.updateTasks(this);
        }
    }

    @Override
    public void removeMentor(Observer observer) {
        observers.remove(observer);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
