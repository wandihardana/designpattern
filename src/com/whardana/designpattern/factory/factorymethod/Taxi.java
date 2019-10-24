package com.whardana.designpattern.factory.factorymethod;

public class Taxi extends Transportation {

    public Taxi(String destination) {
        super(destination);
        name = "Taxi";
        cost = 9.2;
        distance = 31.4;
    }
}
