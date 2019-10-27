package com.whardana.designpattern.factory.abstractfactory;

import com.whardana.designpattern.factory.abstractfactory.Content;
import com.whardana.designpattern.factory.abstractfactory.attribute.AttributeFactory;

public class Video extends Content {

    public Video(AttributeFactory contentFactory) {
        super(contentFactory);
    }

    @Override
    public void setType() {
        type = "Video";
    }
}
