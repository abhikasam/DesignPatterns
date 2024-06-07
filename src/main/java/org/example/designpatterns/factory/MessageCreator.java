package org.example.designpatterns.factory;

public abstract class MessageCreator {
    public Message getMessage(){
        Message message=createMessage();
        message.addHeaders();
        message.encrypt();
        return message;
    }
   public abstract Message createMessage();
}
