public class Person {
	
	private String name;
	private BankAccount bankAccount;
	
	public Person(String n) { 
		this.name = n;
		this.bankAccount = new BankAccountImpl("PeDeMeia", 0); 
	}
	
	public String getName() { 
		return name;
	}
	

}