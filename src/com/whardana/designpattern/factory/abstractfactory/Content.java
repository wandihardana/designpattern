package com.whardana.designpattern.factory.abstractfactory;

import com.whardana.designpattern.factory.abstractfactory.attribute.AttributeFactory;
import com.whardana.designpattern.factory.abstractfactory.attribute.Cover;
import com.whardana.designpattern.factory.abstractfactory.attribute.Font;
import com.whardana.designpattern.factory.abstractfactory.attribute.NextContentMethod;

public abstract class Content {
    String title;
    String type;
    Cover cover;
    Font font;
    NextContentMethod nextContentMethod;

    AttributeFactory attributeFactory;

    public Content(AttributeFactory attributeFactory) {
        this.attributeFactory = attributeFactory;
    }

    public abstract void setType();

    public void setTitle(String title) {
        this.title = title;
    }

    public void prepare(String title) {
        setType();
        setTitle(title);

        cover = attributeFactory.createCover();
        System.out.println("Prepare " + cover.getName());

        font = attributeFactory.createFont();
        System.out.println("Prepare font " + font.getName() + " with size " + font.getSize());

        nextContentMethod = attributeFactory.createNextContentMethod();
        System.out.println("Prepare " + nextContentMethod.getMethod() + "");
    }

    public void addToDraft() {
        System.out.println(type + " has added to Draft list");
    }

    public void approveByEditor() {
        System.out.println(type + " has approved by Editor");
    }

    public void publish() {
        System.out.println(type + " with title \"" + title + "\" has been published");
    }
}
