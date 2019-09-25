package com.whardana.designpattern.strategy;

public class Superhero {
    String name;
    FlyBehavior flyBehavior;
    AttackBehavior attackBehavior;

    public Superhero(String name, FlyBehavior flyBehavior, AttackBehavior attackBehavior) {
        this.name = name;
        this.flyBehavior = flyBehavior;
        this.attackBehavior = attackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
        System.out.println("Got New Fly Ability!");
    }

    public void setAttackBehavior(AttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
        System.out.println("Got New Attack Ability!");
    }

    void describe() {
        System.out.println("This superhero name is " + name);
    }

    void performFly() {
        flyBehavior.fly();
    }

    void performAttack() {
        attackBehavior.attack();
    }
}
