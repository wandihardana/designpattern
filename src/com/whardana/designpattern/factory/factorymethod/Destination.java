package com.whardana.designpattern.factory.factorymethod;

public abstract class Destination {

    String destination;

    public void travel(String transport, String consumer) {
        Transportation transportation = createTransportation(transport);

        transportation.displayInfo();
        transportation.pay();
        transportation.go(consumer);
    }

    public abstract Transportation createTransportation(String transport);
}
