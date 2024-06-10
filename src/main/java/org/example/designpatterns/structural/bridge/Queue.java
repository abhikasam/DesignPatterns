package org.example.designpatterns.structural.bridge;

public class Queue<T> implements FifoCollection<T> {
    private SinglyLinkedList<T>  linkedList=new SinglyLinkedList<>();
    public void offer(T item){
        linkedList.addLast(item);
    }
    public T poll(){
        return linkedList.removeFirst();
    }

    @Override
    public String toString(){
        return linkedList.toString();
    }
}
