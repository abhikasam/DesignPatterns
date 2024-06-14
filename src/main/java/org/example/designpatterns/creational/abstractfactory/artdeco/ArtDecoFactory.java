package org.example.designpatterns.creational.abstractfactory.artdeco;

import org.example.designpatterns.creational.abstractfactory.Chair;
import org.example.designpatterns.creational.abstractfactory.CoffeeTable;
import org.example.designpatterns.creational.abstractfactory.FurnitureFactory;
import org.example.designpatterns.creational.abstractfactory.Sofa;

public class ArtDecoFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }
}
