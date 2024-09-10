package org.example.designpatterns.behavioral.command;

public class AddTextCommand implements ICommand{
    private StringBuilder text;

    private String newText;
    public AddTextCommand(StringBuilder text, String newText) {
        this.text = text;
        this.newText = newText;
    }

    @Override
    public void execute() {
        text.append(newText);
    }

    @Override
    public void undo() {
        int length=newText.length();
        text.delete(text.length()-length,length);
    }
}
