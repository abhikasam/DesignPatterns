package org.example.designpatterns.creational.factory.message;

public abstract class Message {

    public void addHeaders(){}
    public void encrypt(){}
    public abstract String getContent();
}
