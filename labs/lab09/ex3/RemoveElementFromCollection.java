import java.util.Collection;

public class RemoveElementFromCollection implements Command {
    private int elemId;

    // reference to collection
    Collection collection;

    public RemoveElementFromCollection(Collection newCollection) {
        this.collection = newCollection;
        this.elemId = this.collection.size() - 1;
    }

    public void execute() {
        this.collection.remove("elem" + elemId);
        elemId--;
    }

    public void undo() {
        elemId++;
        this.collection.add("elem" + elemId);
    }
}
