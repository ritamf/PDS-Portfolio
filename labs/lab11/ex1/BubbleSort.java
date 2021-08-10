package ex1;

class BubbleSort implements SortStrategy {
    public void sortByProcessor(Phone[] phones) {
        System.out.println("sorting phones by processor, using bubble sort");
    }

	@Override
	public void sortByPrice(Phone[] phones) {
		System.out.println("sorting phones by price, using bubble sort");
		
	}

	@Override
	public void sortByMemory(Phone[] phones) {
		System.out.println("sorting phones by memory, using bubble sort");		
	}

	@Override
	public void sortByCamera(Phone[] phones) {
		System.out.println("sorting phones by camera, using bubble sort");		
	}
	
}