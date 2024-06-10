package org.example.designpatterns.creational.factory;

public class TextMessage extends Message {
    @Override
    public String getContent() {
        return "text";
    }
}
