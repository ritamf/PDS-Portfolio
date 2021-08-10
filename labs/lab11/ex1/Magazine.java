package ex1;

class Magazine {
    private final SortStrategy strategy;

    public Magazine(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortByProcessor(Phone[] telemoveis) {
        strategy.sortByProcessor(telemoveis);
    }
    
    public void sortByPrice(Phone[] telemoveis) {
        strategy.sortByPrice(telemoveis);
    }
    
    public void sortByMemory(Phone[] telemoveis) {
        strategy.sortByMemory(telemoveis);
    }
    
    public void sortByCamera(Phone[] telemoveis) {
        strategy.sortByCamera(telemoveis);
    }
}