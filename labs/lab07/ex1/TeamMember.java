import java.util.Date;

public class TeamMember extends EmployeeDecorator {
    public TeamMember(EmployeeInterface e) {
        super(e);
        System.out.println("Employee is team member");
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

    public void colaborate() {
        System.out.println("Team Member is colaborating");
    }
}
