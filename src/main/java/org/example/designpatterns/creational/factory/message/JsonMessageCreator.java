package org.example.designpatterns.creational.factory.message;

public class JsonMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new JsonMessage();
    }
}
