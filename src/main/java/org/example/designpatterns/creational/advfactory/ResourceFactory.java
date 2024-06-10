package org.example.designpatterns.creational.advfactory;

public interface ResourceFactory {
    Instance createInstance(Instance.Capacity capacity);
    Storage createStorage(int capInMb);
}
