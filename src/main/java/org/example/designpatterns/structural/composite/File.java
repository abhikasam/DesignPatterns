package org.example.designpatterns.structural.composite;

public class File implements Item {
    private String name;
    private double size;
    public File(String name, double size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addItem(Item item) {
        System.out.println("you can't add any item to file.");
    }

    @Override
    public void removeItem(Item item) {
        System.out.println("file doesn't contains any further items.");
    }

    @Override
    public double getSize() {
        return size;
    }
}
