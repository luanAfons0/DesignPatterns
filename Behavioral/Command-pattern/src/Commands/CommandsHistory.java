package Commands;

import java.util.Stack;

import Abstracts.Command;

public class CommandsHistory {
    private Stack<Command> history = new Stack<>();

    public void push(Command command){
        this.history.push(command);
    }

    public Command pop(){
        return this.history.pop();
    }

    public boolean isEmpty(){
        return this.history.isEmpty();
    }
}
