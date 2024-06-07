package org.example.designpatterns.factory;

public class JsonMessage extends Message {
    @Override
    public String getContent() {
        return "{Json}";
    }
}
