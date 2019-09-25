package com.whardana.designpattern.strategy;

public class Superman extends Superhero {
    public Superman() {
        super("Superman", new FlyWithPower(), new PunchAttack());
    }
}
