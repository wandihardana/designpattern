package com.whardana.designpattern.decorator;

public class CheeseTopping extends Topping {
    public CheeseTopping(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public Double getCost() {
        return 1.0 + super.getCost();
    }
}
