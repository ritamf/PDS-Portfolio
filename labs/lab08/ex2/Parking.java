import java.util.List;
import java.util.ArrayList;

public class Parking {

    private List<Employee> empsAllowedToPark = new ArrayList<>();
    private Double sum = 0.0;
    private Integer counter = 0;

    public Parking() {}

    public void allow(Employee e) {

        sum+= e.getSalary();
        counter++;
        Double avg = sum / counter;

        // first employee to attempt to park their car isnt allowed to do so
        if (e.getSalary()>avg) {
            empsAllowedToPark.add(e); 
            System.out.println("They are allowed to park their car");
            
        } else
            System.out.println("They aren't allowed to park their car");

    }

    public List<Employee> getEmpsAllowedToPark() {
        return empsAllowedToPark;
    }
}
