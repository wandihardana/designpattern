package com.whardana.designpattern.decorator;

public class DecoratorPattern {
    public static void main(String[] args) {
        System.out.println("Alibaba Kebab");
        System.out.println("=============\n");

        Food food = new ChickenKebab();
        printOrder(food);

        Food food2 = new ChickenKebab();
        food2 = new EggTopping(food2);
        printOrder(food2);

        Food food3 = new LambKebab();
        food3 = new EggTopping(food3);
        food3 = new EggTopping(food3);
        food3 = new CheeseTopping(food3);
        printOrder(food3);
    }

    public static void printOrder(Food food) {
        Food prettyPrint = new PrettyPrint(food);
        System.out.println("Ordered : " + prettyPrint.getDescription());
        System.out.println("Cost : " + prettyPrint.getCost());
        System.out.println();
    }
}
