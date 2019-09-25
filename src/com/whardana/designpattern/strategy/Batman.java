package com.whardana.designpattern.strategy;

public class Batman extends Superhero {

    public Batman() {
        super("Batman", new FlyNoWay(), new BatarangAttack());
    }
}
