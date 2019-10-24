package com.whardana.designpattern.factory.factorymethod;

public class Train extends Transportation {

    public Train(String destination) {
        super(destination);
        name = "Train";
        cost = 2.5;
        distance = 47.2;
    }
}
