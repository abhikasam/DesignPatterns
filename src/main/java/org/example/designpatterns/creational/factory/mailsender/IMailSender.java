package org.example.designpatterns.creational.factory.mailsender;

public interface IMailSender {
    IMailSender getMailSettings();
    void send();
}
