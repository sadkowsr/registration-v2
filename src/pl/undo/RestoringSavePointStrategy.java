package pl.undo;

import java.util.Stack;


public interface RestoringSavePointStrategy<E extends SavePoint> {
    Stack<UndoCommand> restore(E mySavePoint, Stack<UndoCommand> commandStack);
    E createSavePoint(Stack<UndoCommand> commandStack,String name);
}
