package org.example.designpatterns.structural.facade;

public class RegularEmailFormatter implements EmailFormatter {
    @Override
    public Email format(Email email) {
        //do some magic
        return email;
    }
}
