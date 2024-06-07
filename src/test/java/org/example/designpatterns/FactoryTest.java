package org.example.designpatterns;

import org.example.designpatterns.factory.JsonMessageCreator;
import org.example.designpatterns.factory.Message;
import org.example.designpatterns.factory.MessageCreator;
import org.example.designpatterns.factory.TextMessageCreator;
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
