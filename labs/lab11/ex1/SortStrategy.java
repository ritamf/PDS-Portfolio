package ex1;

interface SortStrategy {
    public void sortByProcessor(Phone[] phones);
    public void sortByPrice(Phone[] phones);
    public void sortByMemory(Phone[] phones);
    public void sortByCamera(Phone[] phones);
}