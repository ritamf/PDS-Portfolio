package ex1;

public class Phone {
	
	private static int idTracker = 0;
	private int id;
	
	private String processor;
	private double price;
	private int memory;
	private String camera;
	
	public Phone(String newProcessor, double newPrice, int newMemory, String newCamera) {
		
		this.id = ++idTracker;
		
		this.processor = newProcessor;
		this.price = newPrice;
		this.memory = newMemory;
		this.camera = newCamera;
	}
}
