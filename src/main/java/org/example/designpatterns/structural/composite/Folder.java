package org.example.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Item {
    private String name;
    private List<Item> items=new ArrayList<>();
    public Folder(String name){
        this.name=name;
    }
    @Override
    public void addItem(Item item){
        items.add(item);
    }

    @Override
    public void removeItem(Item item) {
        items.remove(item);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSize() {
        double totalsize=0;
        for(var item : items){
            totalsize+=item.getSize();
        }
        return totalsize;
    }
}
