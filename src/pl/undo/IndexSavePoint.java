package pl.undo;


public class IndexSavePoint implements SavePoint {

    private String name;
    private UndoCommand command;
    private int index;

    public IndexSavePoint(String savePointName, UndoCommand peek, int stackIndex) {
        name = savePointName;
        command = peek;
        index = stackIndex;
    }

    @Override
    public String getName() {
        return name;
    }


    public UndoCommand getCommand() {
        return command;
    }


    public int getIndex() {
        return index;
    }
}
