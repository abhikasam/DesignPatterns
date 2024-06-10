package org.example.designpatterns.structural.bridge;

public interface FifoCollection <T>{
    void offer(T item);
    T poll();
}
