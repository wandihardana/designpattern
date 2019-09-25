package com.whardana.designpattern.strategy;

public class FlyWithBatWing implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly using BatWing!");
    }
}
