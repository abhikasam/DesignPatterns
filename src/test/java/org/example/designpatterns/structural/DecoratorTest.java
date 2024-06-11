package org.example.designpatterns.structural;

import org.example.designpatterns.decorator.Base64EncodeMessage;
import org.example.designpatterns.decorator.HtmlEncodeMessage;
import org.example.designpatterns.decorator.Message;
import org.example.designpatterns.decorator.TextMessage;
import org.junit.jupiter.api.Test;

public class DecoratorTest {
    @Test
    public void Test(){
        Message message=new TextMessage("It is <SOME> sample text!");
        System.out.println(message.getContent());
        message=new HtmlEncodeMessage(message);
        System.out.println(message.getContent());
        message=new Base64EncodeMessage(message);
        System.out.println(message.getContent());
    }
}
