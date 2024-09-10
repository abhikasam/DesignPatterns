package org.example.designpatterns.creational.factory.message;

public class TextMessage extends Message {
    @Override
    public String getContent() {
        return "text";
    }
}
