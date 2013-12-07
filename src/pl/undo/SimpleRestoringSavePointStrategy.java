package pl.undo;

import java.util.Stack;


public class SimpleRestoringSavePointStrategy implements RestoringSavePointStrategy<IndexSavePoint> {
    @Override
    public Stack<UndoCommand> restore(IndexSavePoint mySavePoint, Stack<UndoCommand> commandStack) {

        IndexSavePoint indxSavePoint = (IndexSavePoint) mySavePoint;

        while(commandStack.size() > 0 && !commandStack.peek().equals(indxSavePoint.getCommand())) {
            commandStack.pop();
        }
        return commandStack;

    }

    @Override
    public IndexSavePoint createSavePoint(Stack<UndoCommand> commandStack, String name) {
        UndoCommand command = null;

        if(commandStack.size() > 0) {
            command = commandStack.peek();
        }
        return new IndexSavePoint(name,command,commandStack.size());
    }
}
