public class Contact {
	private String name;
	private int number;
	
	public Contact(String name, int number) {
		this.name=name;
		this.number=number;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setNumber(int num) {
		this.number = num;
	}
	
	public int getNumber() {
		return this.number;
	}

    public int compareTo(Object o) {

        Contact contact_to_compare = (Contact) o;

        int compare_alphabetic = this.name.compareTo(contact_to_compare.getName());
        if (compare_alphabetic == 0)
            return this.number - contact_to_compare.getNumber();
        return  compare_alphabetic;

    }
	
	public String toString(){
        return String.format("%s:%d", this.name, this.number);
    }
}
