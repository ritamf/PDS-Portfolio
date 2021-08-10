import java.util.Date;

public class TeamLeader extends EmployeeDecorator {
    public TeamLeader(EmployeeInterface e) {
        super(e);
        System.out.println("Employee is team leader");
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

    public void plan() {
        System.out.println("Team Leader is planning");
        
    }
}
