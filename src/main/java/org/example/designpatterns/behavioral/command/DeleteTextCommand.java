package org.example.designpatterns.behavioral.command;

public class DeleteTextCommand implements ICommand {
    private StringBuilder text=new StringBuilder();
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
