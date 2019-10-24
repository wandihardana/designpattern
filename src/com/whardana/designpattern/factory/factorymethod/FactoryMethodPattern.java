package com.whardana.designpattern.factory.factorymethod;

public class FactoryMethodPattern {
    public static void main(String[] args) {
        Destination destination = new GoToWork();

        destination.travel("Train", "John");
        System.out.println();

        destination.travel("Bus", "Jack");
        System.out.println();

        destination.travel("Taxi", "Mary");
    }
}
