package pl.undo;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class UndoProcessor {

    private static UndoProcessor instance;
    private static RestoringSavePointStrategy restoringSavePointStrategy;

    Stack<UndoCommand> commandStack;

    Map<String,SavePoint> savePointRegistry;

    private UndoProcessor(RestoringSavePointStrategy<? extends SavePoint>  restoringSavePointStrategy) {
        commandStack = new Stack<UndoCommand>();
        savePointRegistry = new HashMap<String,SavePoint>();
        this.restoringSavePointStrategy = restoringSavePointStrategy;

    }

    public static UndoProcessor getInstance(RestoringSavePointStrategy<? extends SavePoint>  restoringSavePointStrategy) {

        if(instance == null) {
            instance = new UndoProcessor(restoringSavePointStrategy);
        }
        return instance;  //To change body of created methods use File | Settings | File Templates.
    }

    public void clear() {
        commandStack.clear();
        savePointRegistry.clear();
    }

    public UndoProcessor addUndoCommand(UndoCommand undoCommand) {
        commandStack.push(undoCommand);
        return instance;
    }

    public int getStackSize() {
        return commandStack.size();
    }

    public void undo() {

        while (commandStack.size() > 0 ) {
            UndoCommand command = commandStack.pop();
            command.undo();
        }
    }

    public SavePoint addSavePoint(String savePointName) {

        SavePoint savePoint = restoringSavePointStrategy.createSavePoint(commandStack,savePointName);

        savePointRegistry.put(savePointName,savePoint);

        return savePoint;

    }

    public Collection<SavePoint> getSavePoints() {
        return savePointRegistry.values();
    }

    public void removeSavePoint(String mySavePoint) {
        savePointRegistry.remove(mySavePoint);
    }

    public void restoreSavePoint(String mySavePoint) {
        commandStack = restoringSavePointStrategy.restore(savePointRegistry.get(mySavePoint), commandStack );
    }

    public void setSavePointStrategy(RestoringSavePointStrategy restoringSavePointStrategy) {
        this.restoringSavePointStrategy = restoringSavePointStrategy;
    }
}
