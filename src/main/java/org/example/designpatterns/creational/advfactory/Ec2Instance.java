package org.example.designpatterns.creational.advfactory;

public class Ec2Instance implements  Instance {
    public Ec2Instance(Capacity capacity){}
    @Override
    public void start() {

    }
    @Override
    public void attachStorage(Storage storage) {
    }

    @Override
    public void stop() {

    }
}
