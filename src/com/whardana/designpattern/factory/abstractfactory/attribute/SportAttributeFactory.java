package com.whardana.designpattern.factory.abstractfactory.attribute;

public class SportAttributeFactory implements AttributeFactory {
    @Override
    public Cover createCover() {
        return new FullscreenCover();
    }

    @Override
    public Font createFont() {
        return new MediumCalibri();
    }

    @Override
    public NextContentMethod createNextContentMethod() {
        return new Swipe();
    }
}
