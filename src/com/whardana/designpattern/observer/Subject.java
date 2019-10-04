package com.whardana.designpattern.observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
    void setLocation(String location);
    void locationChanged();
}
