package com.whardana.designpattern.factory.factorymethod;

public class Transportation {
    String name;
    Double cost;
    Double distance;
    String destination;

    public Transportation(String destination) {
        this.destination = destination;
    }

    void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Cost : " + cost);
        System.out.println("Distance : " + distance + " km");
    }

    void pay() {
        System.out.println("Paying the cost to " + destination + " : " + cost);
    }

    void go(String consumer) {
        System.out.println(consumer + " are going to " + destination + " using " + name + " for " + distance + " km");
    }
}
