package pl.undo;

import java.util.Stack;


public class StateRestoringSavePointStrategy implements RestoringSavePointStrategy<StateSavePoint> {
    @Override
    public Stack<UndoCommand> restore(StateSavePoint mySavePoint, Stack<UndoCommand> commandStack) {
        StateSavePoint stateSavePoint  = (StateSavePoint) mySavePoint;

        return stateSavePoint.getState();
    }

    @Override
    public StateSavePoint createSavePoint(Stack<UndoCommand> commandStack, String name) {
        return new StateSavePoint(name, commandStack);
    }
}
