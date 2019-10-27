package com.whardana.designpattern.factory.abstractfactory.attribute;

public interface AttributeFactory {
    Cover createCover();
    Font createFont();
    NextContentMethod createNextContentMethod();
}
