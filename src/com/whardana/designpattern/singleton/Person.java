package com.whardana.designpattern.singleton;

import java.util.Random;

public class Person extends Thread {
    private String name;
    private Random random;

    public Person(String name, Random random) {
        this.name = name;
        this.random = random;
    }

    @Override
    public void run() {
        System.out.println("[Thread " + Thread.currentThread().getId() + "] : " + name + " come!");
        Car car = Car.getInstance();
        car.peopleIn(name);

        if (random.nextInt(2) == 0) {
            car.drive();
        } else {
            car.standBy();
        }
    }
}
