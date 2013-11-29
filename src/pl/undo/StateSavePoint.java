package pl.undo;


import java.util.Stack;

public class StateSavePoint implements SavePoint {

    private String name;

    private Stack<UndoCommand> state;


    public StateSavePoint(String name, Stack<UndoCommand> commandStack) {
        this.name = name;

        state = new Stack<UndoCommand>();

        for (UndoCommand command: commandStack) {
             state.add(command);
        }


    }

    @Override
    public String getName() {
        return name;
    }

    public Stack<UndoCommand> getState() {
        return state;
    }
}
