import java.util.Collection;

// Concrete command
public class AddElementToCollection implements Command {

    private int elemId = -1;

    // reference to collection
    Collection collection;

    public AddElementToCollection(Collection newCollection) {
        this.collection = newCollection;
    }

    public void execute() {
        elemId++;
        this.collection.add("elem" + elemId);
    }

    public void undo() {
        this.collection.remove("elem" + elemId);
        elemId--;
    }
    
}
