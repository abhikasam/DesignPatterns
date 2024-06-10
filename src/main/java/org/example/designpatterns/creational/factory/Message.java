package org.example.designpatterns.creational.factory;

public abstract class Message {

    public void addHeaders(){}
    public void encrypt(){}
    public abstract String getContent();
}
