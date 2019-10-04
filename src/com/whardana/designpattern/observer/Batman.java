package com.whardana.designpattern.observer;

public class Batman implements Observer, DisplayElement {
    private String name;
    private String location;
    private Subject subject;

    public Batman(Subject subject) {
        this.name = "Batman";
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void display() {
        System.out.println(name + " is driving BatMobile to " + location);
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
