package org.example.designpatterns.structural.composite;

public interface Item {
    String getName();
    void addItem(Item item);
    void removeItem(Item item);
    double getSize();
}
