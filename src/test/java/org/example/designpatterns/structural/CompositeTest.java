package org.example.designpatterns.structural;

import org.example.designpatterns.structural.composite.File;
import org.example.designpatterns.structural.composite.Folder;
import org.example.designpatterns.structural.composite.Item;
import org.junit.jupiter.api.Test;

public class CompositeTest {
    @Test
    public void Test(){
        Item drive=new Folder("d-drive");
        Item books=new Folder("books");
        books.addItem(new File("Book 1",120.50));
        books.addItem(new File("Book 2",123.54));
        Item songs=new Folder("songs");
        songs.addItem(new File("song 1",3.4));
        songs.addItem(new File("song 2",6.5));
        songs.addItem(new File("song 3",4.3));
        drive.addItem(books);
        drive.addItem(songs);
        System.out.println(books.getSize());
        System.out.println(songs.getSize());
        System.out.println(drive.getSize());
    }
}
