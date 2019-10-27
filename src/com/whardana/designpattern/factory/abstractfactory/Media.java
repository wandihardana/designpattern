package com.whardana.designpattern.factory.abstractfactory;

public abstract class Media {

    Content publish(String type, String title) {
        Content content = createContent(type);
        content.prepare(title);
        content.addToDraft();
        content.approveByEditor();
        content.publish();

        return content;
    }

    abstract Content createContent(String type);
}
