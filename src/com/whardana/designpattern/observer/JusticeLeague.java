package com.whardana.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class JusticeLeague implements Subject {
    List<Observer> observers;
    String location;

    public JusticeLeague() {
        observers = new ArrayList<>();
        System.out.println("Justice League was newly formed!\n");
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void registerObserver(Observer observer) {
        System.out.println(observer.getName() + " join to Justice League!\n");
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        System.out.println(observer.getName() + " quit from Justice League!\n");
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(location);
        }
        System.out.println();
    }

    public void locationChanged() {
        notifyObserver();
    }
}
