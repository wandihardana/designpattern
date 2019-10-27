package com.whardana.designpattern.factory.abstractfactory;

public class AbstractFactoryPattern {

    public static void main(String[] args) {
        Media sport = new SportMedia();
        sport.publish("Article", "Finally, MU win the Premier League Again");
        System.out.println();
        sport.publish("Video", "Best Goal This Week");

        System.out.println();
        Media history = new HistoryMedia();
        history.publish("Article", "The Knight Templar Story");
        System.out.println();
        history.publish("Video", "Evolution of Human");
    }
}
