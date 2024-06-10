package org.example.designpatterns.structural.bridge;

public class SinglyLinkedList<T> implements LinkedList<T>{
    private class Node{
        T value;
        Node next;
        public Node(T value,Node next){
            this.value=value;
            this.next=next;
        }
    }
    private int size=0;
    private Node top;
    private Node last;

    @Override
    public void addFirst(T item) {
        if(top==null){
            top=new Node(item,null);
            last=top;
        }
        else{
            Node newone=new Node(item,top);
            top=newone;
        }
        size++;
    }

    @Override
    public void addLast(T item) {
        if(last==null){
            top=new Node(item,null);
            last=top;
        }
        else{
            last.next=new Node(item,null);
            last=last.next;
        }
        size++;
    }

    @Override
    public T removeFirst() {
        if(top==null)
            return null;
        T value=top.value;
        if(top==last){
            top=null;
            last=null;
        }
        else{
            top=top.next;
        }
        size--;
        return value;
    }

    @Override
    public T removeLast() {
        if(last==null)
            return null;
        T value=last.value;
        if(top==last){
            top=null;
            last=null;
        }
        else{
            Node iter=top;
            while(iter.next!=last){
                iter=iter.next;
            }
            iter.next=null;
        }
        size--;
        return value;
    }

    @Override
    public int getSize() {
        return size;
    }
    @Override
    public String toString(){
        String result = "[";
        Node temp = top;
        while(temp!=null) {
            result += temp.value.toString() + (temp.next == null?"":", ");
            temp = temp.next;
        }
        result += "]";
        return result;
    }
}
