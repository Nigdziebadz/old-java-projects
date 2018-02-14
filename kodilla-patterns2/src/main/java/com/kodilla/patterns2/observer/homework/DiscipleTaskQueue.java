package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class DiscipleTaskQueue implements Observable {
    private final List<Observer> mentors;
    private final List<String> disciples;
    private final String name;

    public DiscipleTaskQueue(String name) {
        mentors = new ArrayList<>();
        disciples = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task) {
        disciples.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        mentors.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : mentors) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        mentors.remove(observer);
    }

    public List<String> getMessages() {
        return disciples;
    }

    public String getName() {
        return name;
    }
}


