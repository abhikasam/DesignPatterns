package org.example.designpatterns.creational.abstractfactory.victorian;

import org.example.designpatterns.creational.abstractfactory.Chair;
import org.example.designpatterns.creational.abstractfactory.CoffeeTable;
import org.example.designpatterns.creational.abstractfactory.FurnitureFactory;
import org.example.designpatterns.creational.abstractfactory.Sofa;

public class VictorianFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
