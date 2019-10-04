package com.whardana.designpattern.observer;

public interface Observer {
    void update(String location);
    String getName();
    void quit();
}
