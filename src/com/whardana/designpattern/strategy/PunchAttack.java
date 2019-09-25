package com.whardana.designpattern.strategy;

public class PunchAttack implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("Attack using punch!");
    }
}
