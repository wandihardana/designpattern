package com.whardana.designpattern.factory.abstractfactory;

import com.whardana.designpattern.factory.abstractfactory.attribute.AttributeFactory;

public class Article extends Content {

    public Article(AttributeFactory contentAttributeFactory) {
        super(contentAttributeFactory);
    }

    @Override
    public void setType() {
        type = "Article";
    }
}
