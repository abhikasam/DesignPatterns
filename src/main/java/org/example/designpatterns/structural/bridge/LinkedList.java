package org.example.designpatterns.structural.bridge;

public interface LinkedList<T> {
    void addFirst(T item);
    void addLast(T item);
    T removeFirst();
    T removeLast();
    int getSize();
}
