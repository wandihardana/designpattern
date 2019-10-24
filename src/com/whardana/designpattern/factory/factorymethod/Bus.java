package com.whardana.designpattern.factory.factorymethod;

public class Bus extends Transportation {
    public Bus(String destination) {
        super(destination);
        name = "Bus";
        cost = 0.75;
        distance = 53.1;
    }
}
