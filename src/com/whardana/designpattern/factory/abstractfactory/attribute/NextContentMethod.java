package com.whardana.designpattern.factory.abstractfactory.attribute;

public abstract class NextContentMethod {
    String method;

    public NextContentMethod(String method) {
        this.method = method;
    }

    public String getMethod() {
        return method;
    }
}
