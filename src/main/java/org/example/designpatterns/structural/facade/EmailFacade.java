package org.example.designpatterns.structural.facade;

public class EmailFacade {
    public void sendEmail(String subject,String body,String to,String cc){
        Email email=new Email();
        //add smtp
        email.setSubject(subject);
        email.setBody(body);
        email.setTo(to);
        email.setCc(cc);
        EmailFormatter emailFormatter=new RegularEmailFormatter();
        email=emailFormatter.format(email);
        EmailHeader emailHeader=new EmailHeader();
        email=emailHeader.addFiles(email);
        EmailEncrypter emailEncrypter=new EmailEncrypter();
        email=emailEncrypter.encrypt(email);
        email.setBody(new CompanyEmailTemplate().addHeaderAndFooter(email.getBody()));
        email.send();
    }
}
