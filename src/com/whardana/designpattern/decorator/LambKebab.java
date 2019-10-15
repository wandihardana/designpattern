package com.whardana.designpattern.decorator;

public class LambKebab implements Food {
    @Override
    public String getDescription() {
        return "Lamb Kebab";
    }

    @Override
    public Double getCost() {
        return 3.0;
    }
}
