package org.example.designpatterns.creational.factory.message;

public class JsonMessage extends Message {
    @Override
    public String getContent() {
        return "{Json}";
    }
}
