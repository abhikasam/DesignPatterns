package org.example.designpatterns.factory.animal;

public class AnimalFactory {
    public Animal getAnimal(String type){
        if(type.equals("lion"))
            return new Lion();
        if(type.equals("monkey"))
            return new Monkey();
        if(type.equals("elephant"))
            return new Elephant();
        return null;
    }
    public void makeEat(Animal animal){
        animal.eat();
    }
}
