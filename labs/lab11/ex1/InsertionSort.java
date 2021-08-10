package ex1;

class InsertionSort implements SortStrategy {

	@Override
	public void sortByProcessor(Phone[] phones) {
		System.out.println("sorting phones by processor, using insertion sort");
		
	}

	@Override
	public void sortByPrice(Phone[] phones) {
		System.out.println("sorting phones by price, using insertion sort");
		
	}

	@Override
	public void sortByMemory(Phone[] phones) {
		System.out.println("sorting phones by memory, using insertion sort");
		
	}

	@Override
	public void sortByCamera(Phone[] phones) {
		System.out.println("sorting phones by camera, using insertion sort");
		
	}

}