package org.example.designpatterns.factory;

public abstract class Message {

    public void addHeaders(){}
    public void encrypt(){}
    public abstract String getContent();
}
