package pl.undo;

import org.testng.annotations.*;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;


public class UndoProcessorTest  {

    private static UndoProcessor undoProcessor;

    @BeforeClass
    public static void initializationProcessor() {
        undoProcessor = UndoProcessor.getInstance(new SimpleRestoringSavePointStrategy());
    }
    @BeforeMethod
    public void cleanUp() {
        undoProcessor.clear();
    }
    @Test
    public void initializationTest() {
        assertNotNull(undoProcessor);
    }

    @Test
    public void addOperationAndMakeUndo() {


        undoProcessor.addUndoCommand(getUndoCommand("name 1"));

       assertEquals(1,undoProcessor.getStackSize());

        undoProcessor.undo();

       assertEquals(0,undoProcessor.getStackSize());
    }

    @Test void addSavePoint() {

        undoProcessor.addSavePoint("SavePointName");

        assertEquals(1,undoProcessor.getSavePoints().size());

        SavePoint savePoint = undoProcessor.getSavePoints().iterator().next();

        assertEquals("SavePointName",savePoint.getName());
    }

    @Test(dataProvider = "getSavePointStrategy")
    void testRestore(RestoringSavePointStrategy strategy) {

        undoProcessor.setSavePointStrategy(strategy);

        undoProcessor.addUndoCommand(getUndoCommand("name 1"));
        undoProcessor.addUndoCommand(getUndoCommand("name 2"));
        undoProcessor.addSavePoint("mySavePoint");
        undoProcessor.addUndoCommand(getUndoCommand("name 3"));
        undoProcessor.addUndoCommand(getUndoCommand("name 4"));

        assertEquals(4, undoProcessor.getStackSize());
        assertEquals(1, undoProcessor.getSavePoints().size());

        undoProcessor.restoreSavePoint("mySavePoint");

        assertEquals(undoProcessor.getStackSize(), 2);
        assertEquals(undoProcessor.getSavePoints().size(),1);

        undoProcessor.removeSavePoint("mySavePoint");

        assertEquals(undoProcessor.getSavePoints().size(),0);


    }
    @DataProvider
    public static RestoringSavePointStrategy[][] getSavePointStrategy() {

        return new RestoringSavePointStrategy[][]{{
                new SimpleRestoringSavePointStrategy()},{
                new StateRestoringSavePointStrategy()}
        };

    }




    private UndoCommand getUndoCommand(String name) {
        return new NamedUndoCommand(name);
    }


}
