package com.whardana.designpattern.strategy;

public class LassoAttack implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("Attack using lasso!");
    }
}
