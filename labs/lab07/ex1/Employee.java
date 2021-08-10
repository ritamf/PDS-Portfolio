import java.util.Date;

public class Employee implements EmployeeInterface {

    public Employee() {
        System.out.println("Employee added");
    }

    public void start(Date d) {
        System.out.println("Employee starts working at " + d);
    }

    public void terminate(Date d) {
        System.out.println("Employee finishes work at " + d);
    }

    public void work() {
        System.out.println("Employee is working");
    }
}
