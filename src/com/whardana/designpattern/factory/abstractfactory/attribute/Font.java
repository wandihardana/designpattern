package com.whardana.designpattern.factory.abstractfactory.attribute;

public abstract class Font {
    String name;
    Integer size;

    public Font(String name, Integer size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public Integer getSize() {
        return size;
    }
}
