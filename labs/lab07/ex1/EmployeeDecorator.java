import java.util.Date;

public abstract class EmployeeDecorator implements EmployeeInterface {
    protected EmployeeInterface employee;

    public EmployeeDecorator(EmployeeInterface e) {
        this.employee = e;
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

}
