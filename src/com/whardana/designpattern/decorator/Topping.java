package com.whardana.designpattern.decorator;

public abstract class Topping implements Food {
    private Food food;

    public Topping(Food food) {
        this.food = food;
    }

    @Override
    public String getDescription() {
        return food.getDescription();
    }

    @Override
    public Double getCost() {
        return food.getCost();
    }
}
