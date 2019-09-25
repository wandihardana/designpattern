package com.whardana.designpattern.strategy;

public class WonderWoman extends Superhero {
    public WonderWoman() {
        super("Wonder Woman", new FlyWithPower(), new LassoAttack());
    }
}
