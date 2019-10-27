package com.whardana.designpattern.factory.abstractfactory;

import com.whardana.designpattern.factory.abstractfactory.attribute.AttributeFactory;
import com.whardana.designpattern.factory.abstractfactory.attribute.SportAttributeFactory;

public class SportMedia extends Media {
    @Override
    Content createContent(String type) {
        AttributeFactory attributeFactory = new SportAttributeFactory();

        if (type.equals("Article")) {
            return new Article(attributeFactory);
        } else if (type.equals("Video")) {
            return new Video(attributeFactory);
        }

        return null;
    }
}
