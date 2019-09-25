package com.whardana.designpattern.strategy;

public class FlyWithPower implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly using power!");
    }
}
