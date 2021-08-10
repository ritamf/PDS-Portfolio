package strategy2;

class ContextWithSorting {
    private final SortStrategy strategy;

    public ContextWithSorting(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(int[] input) {
        strategy.sort(input);
    }
}