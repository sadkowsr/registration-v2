package pl.undo;

/**
 * Created with IntelliJ IDEA.
 * User: przemcio
 * Date: 14.01.13
 * Time: 22:59
 * To change this template use File | Settings | File Templates.
 */
public class NamedUndoCommand implements UndoCommand {

    private String name;

    public NamedUndoCommand(String name) {
        this.name = name;
    }

    @Override
    public void undo() {

    }

    @Override
    public String toString() {
        return "Command:"+name +"\n";
    }
}
