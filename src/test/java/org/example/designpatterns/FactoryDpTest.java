package org.example.designpatterns;

import org.example.designpatterns.factory.animal.Animal;
import org.example.designpatterns.factory.animal.AnimalFactory;
import org.example.designpatterns.factory.product.IProduct;
import org.example.designpatterns.factory.product.ProductFactory;
import org.junit.jupiter.api.Test;

public class FactoryDpTest {
    @Test
    public void Test(){
        ProductFactory factory=new ProductFactory();
        IProduct windowsProduct=factory.getInstance("windows");
        IProduct macProduct=factory.getInstance("mac");
        IProduct iosProduct=factory.getInstance("ios");
        IProduct andProduct=factory.getInstance("android");
        windowsProduct.getProductDetails();
        macProduct.getProductDetails();
        iosProduct.getProductDetails();
        andProduct.getProductDetails();

        AnimalFactory animalFactory=new AnimalFactory();
        Animal elephant=animalFactory.getAnimal("elephant");
        Animal lion=animalFactory.getAnimal("lion");
        Animal monkey=animalFactory.getAnimal("monkey");
        animalFactory.makeEat(elephant);
        animalFactory.makeEat(lion);
        animalFactory.makeEat(monkey);
    }
}
