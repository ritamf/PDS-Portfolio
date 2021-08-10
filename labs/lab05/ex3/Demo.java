import java.util.*;

public class Demo {
	
	public static void main(String[] args) {
		MovieBuilder.Builder builder = new MovieBuilder.Builder("Inception", 2010);
		
		List<Place> locations = new ArrayList<Place>();
		locations.add(new Place("California"));
		locations.add(new Place("Japan"));
		
		builder.diretor(new Person("Christopher", "Nolan")).isNetflix(true);
		builder.locations(locations);
		System.out.println(builder.build());
		
		
	}

}