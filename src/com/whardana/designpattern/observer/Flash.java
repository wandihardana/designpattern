package com.whardana.designpattern.observer;

public class Flash implements Observer, DisplayElement {
    private String name;
    private String location;
    private Subject subject;

    public Flash(Subject subject) {
        this.name = "Flash";
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void display() {
        System.out.println(name + " is running to " + location);
    }

    @Override
    public void update(String location) {
        this.location = location;
        display();
    }

    @Override
    public void quit() {
        subject.removeObserver(this);
    }
}
