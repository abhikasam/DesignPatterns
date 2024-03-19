package org.example.designpatterns.factory.product;

public class AndriodProduct implements IProduct {
    @Override
    public void getProductDetails() {
        System.out.println("android product");
    }
}
