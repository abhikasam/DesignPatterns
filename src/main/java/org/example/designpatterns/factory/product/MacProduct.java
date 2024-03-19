package org.example.designpatterns.factory.product;

public class MacProduct implements IProduct {

    @Override
    public void getProductDetails() {
        System.out.println("mac product");
    }
}
