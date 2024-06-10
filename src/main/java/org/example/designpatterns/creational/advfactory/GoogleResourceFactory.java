package org.example.designpatterns.creational.advfactory;

public class GoogleResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capInMb) {
        return new GoogleCloudStorage(capInMb);
    }
}
