package org.example.designpatterns.creational.factory;

public class JsonMessage extends Message {
    @Override
    public String getContent() {
        return "{Json}";
    }
}
