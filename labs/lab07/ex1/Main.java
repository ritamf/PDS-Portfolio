import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // creating all possible types of employees

        EmployeeInterface employee = new Employee();

        System.out.println();
        EmployeeInterface member = new TeamMember(new Employee());
        System.out.println();
        EmployeeInterface leader = new TeamLeader(new Employee());
        System.out.println();
        EmployeeInterface manager = new Manager(new Employee());

        System.out.println();
        EmployeeInterface member_leader = new TeamLeader(new TeamMember(new Employee()));
        System.out.println();
        EmployeeInterface member_manager = new Manager(new TeamMember(new Employee()));
        System.out.println();
        EmployeeInterface leader_manager = new TeamLeader(new Manager(new Employee()));
        
        System.out.println();
        EmployeeInterface jack_of_all_trades = new Manager(new TeamLeader(new TeamMember(new Employee())));


        // calling some methods

        System.out.println();
        jack_of_all_trades.start(new Date());
        jack_of_all_trades.terminate(new Date());
        jack_of_all_trades.work();

        ( (TeamLeader) leader_manager).plan();
        
        try {
            ( (Manager) leader_manager).manage();
        } catch (Exception e) {
            System.err.println("leader_manager cant plan (Manager was called before TeamLeader)");
        } 

    }
 }