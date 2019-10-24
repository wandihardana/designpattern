package com.whardana.designpattern.factory.factorymethod;

public class GoToWork extends Destination {

    public GoToWork() {
        destination = "Work";
    }

    @Override
    public Transportation createTransportation(String transport) {
        if (transport.equals("Train")) {
            return new Train(destination);
        } else if (transport.equals("Bus")) {
            return new Bus(destination);
        } else if (transport.equals("Taxi")) {
            return new Taxi(destination);
        } else {
            throw new RuntimeException("Invalid Transportation");
        }
    }
}
