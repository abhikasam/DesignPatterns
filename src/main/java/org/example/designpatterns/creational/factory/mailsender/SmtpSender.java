package org.example.designpatterns.creational.factory.mailsender;

public class SmtpSender implements IMailSender{
    @Override
    public IMailSender getMailSettings() {
        return null;
    }

    @Override
    public void send() {

    }
}
