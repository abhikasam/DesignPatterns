package org.example.designpatterns;

import org.example.designpatterns.creational.factory.message.JsonMessageCreator;
import org.example.designpatterns.creational.factory.message.Message;
import org.example.designpatterns.creational.factory.message.MessageCreator;
import org.example.designpatterns.creational.factory.message.TextMessageCreator;
import org.junit.jupiter.api.Test;

public class FactoryTest {
    @Test
    public void Test(){
        MessageCreator messageCreator=new TextMessageCreator();
        Message message=messageCreator.createMessage();
        System.out.println(message.getContent());
        messageCreator=new JsonMessageCreator();
        message=messageCreator.createMessage();
        System.out.println(message.getContent());
    }
}
