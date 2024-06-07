package org.example.designpatterns.factory;

public class TextMessage extends Message {
    @Override
    public String getContent() {
        return "text";
    }
}
