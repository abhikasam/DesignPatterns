package org.example.designpatterns.structural;

import org.example.designpatterns.structural.facade.Email;
import org.example.designpatterns.structural.facade.EmailFacade;
import org.junit.jupiter.api.Test;

public class FacadeTest {
    @Test
    public void Test(){
        EmailFacade emailFacade=new EmailFacade();
        emailFacade.sendEmail("Sample subject","email body","toadderess","ccaddress");
    }
}
