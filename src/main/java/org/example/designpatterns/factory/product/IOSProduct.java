package org.example.designpatterns.factory.product;

public class IOSProduct implements IProduct {
    @Override
    public void getProductDetails() {
        System.out.println("ios product");
    }
}
