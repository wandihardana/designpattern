package com.whardana.designpattern.factory.abstractfactory.attribute;

public class HistoryAttributeFactory implements AttributeFactory {
    @Override
    public Cover createCover() {
        return new PaddingCover();
    }

    @Override
    public Font createFont() {
        return new LargeTimesNewRoman();
    }

    @Override
    public NextContentMethod createNextContentMethod() {
        return new Scroll();
    }
}
