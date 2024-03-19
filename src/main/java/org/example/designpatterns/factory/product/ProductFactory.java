package org.example.designpatterns.factory.product;

public class ProductFactory {
    public IProduct getInstance(String type){
        if(type.equals("android"))
            return new AndriodProduct();
        if(type.equals("ios"))
            return new IOSProduct();
        if(type.equals("windows"))
            return new WindowsProduct();
        if(type.equals("mac"))
            return new MacProduct();
        return null;
    }
}
