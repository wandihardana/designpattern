package com.whardana.designpattern.singleton;

import java.util.Random;

public class SingletonPattern {
    public static void main(String[] args) throws InterruptedException {

        Car.getInstance().standBy();

        Random random = new Random();
        String[] names = {"Jack", "John", "Jill", "Jesse", "Jason", "Julliet", "Judith", "Jordan", "June"};
        Thread[] threads = new Thread[names.length];

        for (int i=0;i<names.length;i++) {
            threads[i] = new Person(names[i], random);
        }

        for (int i=0;i<names.length;i++) {
            threads[i].start();
        }

        for (int i=0;i<names.length;i++) {
            threads[i].join();
        }
    }

}
