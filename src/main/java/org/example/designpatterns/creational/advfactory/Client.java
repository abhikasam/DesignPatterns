package org.example.designpatterns.creational.advfactory;

public class Client {
    private ResourceFactory resourceFactory;
    public Client(ResourceFactory resourceFactory){
        this.resourceFactory=resourceFactory;
    }
    public Instance createServer(Instance.Capacity capacity,int storageMb){
        Instance instance=resourceFactory.createInstance(capacity);
        Storage storage=resourceFactory.createStorage(storageMb);
        instance.attachStorage(storage);
        return instance;
    }
}
