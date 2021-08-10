import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

    private static Invoker control = new Invoker();
    private static Collection collection = new ArrayList<>();
    private static Iterator collectionIterator = collection.iterator();

    public static void main(String[] args) {

        addXElementsAndUndoYTimes(10, 5);

        removeXElementsAndUndoYTimes(collection.size(), 5);

    }

    public static void addXElementsAndUndoYTimes(int x, int y) {

        Command addElement = new AddElementToCollection(collection);
        
        control.setCommand(addElement);

        for (int i = 0; i < x; i++)
            control.invoke();

        System.out.println("Size of collection after adding " + x + " elements: " + collection.size());

        for (int i = 0; i < y; i++)
            control.invokeUndo();

        System.out.println("Size of collection after calling invokeUndo() " + y + " times: " + collection.size());
    }

    public static void removeXElementsAndUndoYTimes(int x, int y) {
        Command removeElement = new RemoveElementFromCollection(collection);

        control.setCommand(removeElement);
        
        for (int i = 0; i < x; i++)
            control.invoke();

        System.out.println("Size of collection after removing " + x + " elements: " + collection.size());

        for (int i = 0; i < y; i++)
            control.invokeUndo();

        System.out.println("Size of collection after calling invokeUndo() " + y + " times: " + collection.size());
    }
}
