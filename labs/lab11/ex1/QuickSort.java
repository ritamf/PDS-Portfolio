package ex1;

class QuickSort implements SortStrategy {

	@Override
	public void sortByProcessor(Phone[] phones) {
    	System.out.println("sorting phones by processor, using quick sort");
		
	}

	@Override
	public void sortByPrice(Phone[] phones) {
    	System.out.println("sorting phones by price, using quick sort");
		
	}

	@Override
	public void sortByMemory(Phone[] phones) {
    	System.out.println("sorting phones by memory, using quick sort");
		
	}

	@Override
	public void sortByCamera(Phone[] phones) {
    	System.out.println("sorting phones by cameara, using quick sort");
		
	}
}
