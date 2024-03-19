package org.example.designpatterns.factory.product;

public class WindowsProduct implements IProduct {
    @Override
    public void getProductDetails() {
        System.out.println("windows product");
    }
}
