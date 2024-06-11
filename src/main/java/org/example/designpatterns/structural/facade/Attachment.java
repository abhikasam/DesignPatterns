package org.example.designpatterns.structural.facade;

public class Attachment {
    private String filepath;

    public String getFilepath() {
        return filepath;
    }

    public Attachment(String filepath) {
        this.filepath = filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }
}
