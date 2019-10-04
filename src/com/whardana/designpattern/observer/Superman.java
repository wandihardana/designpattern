package com.whardana.designpattern.observer;

public class Superman implements Observer, DisplayElement {
    private String name;
    private String location;
    private Subject subject;

    public Superman(Subject subject) {
        this.name = "Superman";
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void display() {
        System.out.println(name + " is flying to " + location);
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
