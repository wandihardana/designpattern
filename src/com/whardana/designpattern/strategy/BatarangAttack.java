package com.whardana.designpattern.strategy;

public class BatarangAttack implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("Attack using Batarang!");
    }
}
