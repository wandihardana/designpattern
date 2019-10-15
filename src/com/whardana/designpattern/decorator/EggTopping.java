package com.whardana.designpattern.decorator;

public class EggTopping extends Topping {

    public EggTopping(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Eggs";
    }

    @Override
    public Double getCost() {
        return 0.5 + super.getCost();
    }
}
