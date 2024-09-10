package org.example.designpatterns.behavioral.command;

import java.util.Stack;

public class TextEditor {
    private StringBuilder text=new StringBuilder();
    private Stack<ICommand> commandHistory=new Stack<>();
    private Stack<ICommand> redoHistory=new Stack<>();

    public void save(ICommand command){
        command.execute();
        commandHistory.push(command);
        redoHistory.clear();
    }

    public void undo(){
        if(!commandHistory.empty()){
            ICommand undoTop=commandHistory.pop();
            redoHistory.push(undoTop);
            undoTop.execute();
        }
    }

    public void redo(){
        if(!redoHistory.empty()){
            ICommand redoTop=commandHistory.pop();
            commandHistory.push(redoTop);
            redoTop.execute();
        }
    }

    public String getText(){
        return this.text.toString();
    }
}
