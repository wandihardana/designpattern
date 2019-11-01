package com.whardana.designpattern.singleton;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private volatile static Car instance;
    private boolean isDrive;
    private List<String> peoples;
    private static final int MAX_SEAT = 4;

    private Car() {
        isDrive = false;
        peoples = new ArrayList();
    }

    public static Car getInstance() {
        if (instance == null) {
            synchronized (Car.class) {
                if (instance == null) {
                    instance = new Car();
                }
            }
        }
        return instance;
    }

    public void standBy() {
        isDrive = false;
        System.out.println("The car is standby!");
    }

    public void peopleIn(String name) {
        if (isDrive) {
            System.out.println(name + " cannot come in because the car is driving!");
        } else if (peoples.size() >= MAX_SEAT) {
            System.out.println(name + " cannot come in because the car is full!");
        } else {
            System.out.println(name + " come in to the car!");
            peoples.add(name);
        }
    }

    public void drive() {
        isDrive = true;
        if (peoples.isEmpty()) {
            System.out.println("The car is driving!");
        } else {
            System.out.println("The car is driving with " + peoples.toString() + "!");
        }

        peoples.clear();
    }

}
