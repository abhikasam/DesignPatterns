package org.example.designpatterns.creational.abstractfactory.modern;

import org.example.designpatterns.creational.abstractfactory.Chair;
import org.example.designpatterns.creational.abstractfactory.CoffeeTable;
import org.example.designpatterns.creational.abstractfactory.FurnitureFactory;
import org.example.designpatterns.creational.abstractfactory.Sofa;

public class ModernFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
