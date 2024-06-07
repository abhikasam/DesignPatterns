package org.example.designpatterns.advfactory;

public interface Instance {
    enum Capacity{micro,small,large}
    void start();
    void attachStorage(Storage storage);
    void stop();
}
