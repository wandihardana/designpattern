package com.whardana.designpattern.strategy;

public class StrategyPattern {

    public static void main(String[] args) {
        System.out.println("DC Superhero");
        System.out.println("============");

        Superhero superhero = new Superman();
        superhero.describe();
        superhero.performFly();
        superhero.performAttack();
        System.out.println();

        superhero = new WonderWoman();
        superhero.describe();
        superhero.performFly();
        superhero.performAttack();
        superhero.setAttackBehavior(new PunchAttack());
        superhero.performAttack();
        System.out.println();

        superhero = new Batman();
        superhero.describe();
        superhero.performFly();
        superhero.performAttack();
        superhero.setFlyBehavior(new FlyWithBatWing());
        superhero.performFly();
    }
}
