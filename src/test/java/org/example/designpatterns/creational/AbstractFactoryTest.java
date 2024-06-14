package org.example.designpatterns.creational;

import org.example.designpatterns.creational.abstractfactory.FurnitureFactory;
import org.example.designpatterns.creational.abstractfactory.artdeco.ArtDecoFactory;
import org.example.designpatterns.creational.abstractfactory.modern.ModernFactory;
import org.example.designpatterns.creational.abstractfactory.victorian.VictorianFactory;
import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {
    @Test
    public void Test(){
        FurnitureFactory furnitureFactory=new ModernFactory();
        System.out.println(furnitureFactory.createChair());
        FurnitureFactory furnitureFactory1=new VictorianFactory();
        System.out.println(furnitureFactory1.createCoffeeTable());
        FurnitureFactory furnitureFactory2=new ArtDecoFactory();
        System.out.println(furnitureFactory2.createSofa());
    }
}
