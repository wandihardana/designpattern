package com.whardana.designpattern.factory.abstractfactory;

import com.whardana.designpattern.factory.abstractfactory.attribute.AttributeFactory;
import com.whardana.designpattern.factory.abstractfactory.attribute.HistoryAttributeFactory;

public class HistoryMedia extends Media {
    @Override
    Content createContent(String type) {
        AttributeFactory attributeFactory = new HistoryAttributeFactory();

        if (type.equals("Article")) {
            return new Article(attributeFactory);
        } else if (type.equals("Video")) {
            return new Video(attributeFactory);
        }

        return null;
    }
}
