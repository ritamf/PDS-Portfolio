package strategy2;

public class SortingStrategyMain {
    public static void main(String args[]) {
        int[] var = { 1, 2, 3, 4, 5 };
        ContextWithSorting quick = new ContextWithSorting(new QuickSort());
        ContextWithSorting bub = new ContextWithSorting(new BubbleSort());

        quick.sort(var);
        bub.sort(var);
        quick.sort(var);
    }
}