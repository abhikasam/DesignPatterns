package org.example.designpatterns.structural.facade;

import java.util.ArrayList;
import java.util.List;

public class Email {
    private String subject;
    private String body;
    private String to;
    private String cc;
    private List<Attachment> attachments;

    public Email(){
        attachments=new ArrayList<>();
    }

    public void addAttachment(String filepath){
        Attachment attachment=new Attachment(filepath);
        attachments.add(attachment);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public void removeAttachment(String filepath){
        Attachment attachment=attachments.stream().filter(i->i.getFilepath()==filepath).findFirst().get();
        attachments.remove(attachment);
    }
    public void send(){
        //send email
    }
}
