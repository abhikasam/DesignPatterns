package org.example.designpatterns.creational.advfactory;

public class AWSResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capInMb) {
        return new S3Storage(capInMb);
    }
}
