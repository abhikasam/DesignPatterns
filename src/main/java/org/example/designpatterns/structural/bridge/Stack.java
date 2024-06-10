package org.example.designpatterns.structural.bridge;

public class Stack<T> implements LifoCollection<T> {
    private SinglyLinkedList<T> linkedList=new SinglyLinkedList<>();
    @Override
    public void push(T item) {
        linkedList.addFirst(item);
    }

    @Override
    public T pop() {
        return linkedList.removeFirst();
    }

    @Override
    public String toString() {
        return linkedList.toString();
    }
}
