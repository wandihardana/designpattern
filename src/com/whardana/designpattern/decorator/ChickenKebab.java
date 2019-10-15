package com.whardana.designpattern.decorator;

public class ChickenKebab implements Food {
    @Override
    public String getDescription() {
        return "Chicken Kebab";
    }

    @Override
    public Double getCost() {
        return 2.0;
    }
}
