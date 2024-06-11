package org.example.designpatterns.structural.facade;

public class EmailHeader {
    public Email addFiles(Email email){
        //add files to attachments from email body
        return email;
    }
}
