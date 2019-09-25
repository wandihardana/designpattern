package com.whardana.designpattern.strategy;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Cannot fly!");
    }
}
