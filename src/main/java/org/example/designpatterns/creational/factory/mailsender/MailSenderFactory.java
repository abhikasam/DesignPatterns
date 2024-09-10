package org.example.designpatterns.creational.factory.mailsender;

public class MailSenderFactory {
    public IMailSender getMailSender(String sender){
        switch (sender){
            case "GraphAPI": return new GraphApiMailsender();
            case "SMTP":
            default: return new SmtpSender();
        }
    }
}
