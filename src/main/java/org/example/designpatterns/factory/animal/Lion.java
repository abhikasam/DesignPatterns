package org.example.designpatterns.factory.animal;

public class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("eating with out using hands.");
    }
}
