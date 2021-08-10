import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class Demo {
    private static VectorGeneric<Object> vg;
    private static Iterator<Object> iterator;
    private static ListIterator<Object> listIterator;
    private static ListIterator<Object> listIteratorWithIndex;

    public static void main(String[] args) {

        createVectorWithData();
        
        int index = vg.totalElem() / 2; 

        // verify all created operations
        testVectorWithIterator();
        testVectorWithListIterator();
        testVectorWithListIteratorWithIndexArgument(index);
        testVectorWithSeveralIterators(index);
        testVectorWithListIteratorsByIteratingBackwards(index);

    }

    private static void createVectorWithData() {
        vg = new VectorGeneric<>();

        for (int i = 0; i < 5; i++)
            vg.addElem(i);

        for (int i = 5; i < 10; i++)
            vg.addElem("elem" + i);
    }

    private static void testAllImplementedOperations() {

    }

    private static void testVectorWithIterator() {
        System.out.println("\nTest vector with iterator:");

        iterator = vg.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

    private static void testVectorWithListIterator() {
        System.out.println("\nTest vector with list iterator:");

        listIterator = vg.listIterator();
        while (listIterator.hasNext())
            System.out.println(listIterator.next());
    }

    private static void testVectorWithListIteratorWithIndexArgument(int index) {
        System.out.println("\nTest vector with list iterator, given an index:");

        listIteratorWithIndex = vg.listIterator(index);
        while (listIteratorWithIndex.hasNext())
            System.out.println(listIteratorWithIndex.next());
    }

    private static void testVectorWithSeveralIterators(int index) {
        System.out.println("\nTest vector with several iterators:");

        iterator = vg.iterator();
        listIterator = vg.listIterator();
        listIteratorWithIndex = vg.listIterator(index);

        while (iterator.hasNext()) {
            System.out.println("iterator: " + iterator.next());
            System.out.println("    list iterator: " + listIterator.next());

            if (listIteratorWithIndex.nextIndex() < vg.totalElem()) {
                listIteratorWithIndex.previous();
                System.out.println("        list iterator with index: " + listIteratorWithIndex.next());
            }
        }
    }

    private static void testVectorWithListIteratorsByIteratingBackwards(int index) {
        System.out.println("\nTest vector with with list iterators by iterating backwards:");

        listIterator = vg.listIterator();
        listIteratorWithIndex = vg.listIterator(index);

        // iterate with listIterator so that it can be used to iterate backwards
        while (listIterator.hasNext())
            listIterator.next();
        listIterator.previous();

        while (listIterator.hasPrevious()) {
            System.out.println("list iterator: " + listIterator.previous());

            if (listIteratorWithIndex.previousIndex() > 0) {
                listIteratorWithIndex.next();
                System.out.println("    list iterator with index: " + listIteratorWithIndex.previous());
            }

        }

    }
}
