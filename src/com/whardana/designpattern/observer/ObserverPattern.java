package com.whardana.designpattern.observer;

public class ObserverPattern {

    public static void main(String[] args) {
        Subject subject = new JusticeLeague();

        Observer batman = new Batman(subject);
        Observer superman = new Superman(subject);

        subject.setLocation("Gotham City");
        subject.locationChanged();

        Observer flash = new Flash(subject);

        subject.setLocation("Metro City");
        subject.locationChanged();

        superman.quit();

        subject.setLocation("Central City");
        subject.locationChanged();
    }

}
