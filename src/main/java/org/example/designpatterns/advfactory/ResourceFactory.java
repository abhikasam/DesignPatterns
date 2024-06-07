package org.example.designpatterns.advfactory;

public interface ResourceFactory {
    Instance createInstance(Instance.Capacity capacity);
    Storage createStorage(int capInMb);
}
