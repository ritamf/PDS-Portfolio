import java.util.Date;

public class Manager extends EmployeeDecorator {

    public Manager(EmployeeInterface e) {
        super(e);
        System.out.println("Employee is manager");
    }

    public void start(Date d) {
        employee.start(d);
    }

    public void terminate(Date d) {
        employee.terminate(d);
    }

    public void work() {
        employee.work();
    }

    public void manage() {
        System.out.println("Manager is managing");
    }
}
