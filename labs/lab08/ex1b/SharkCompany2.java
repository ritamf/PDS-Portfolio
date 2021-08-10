import java.util.List;

public class SharkCompany2 {
    public static void main(String[] args) {
        Person[] persons = { new Person("Maria Silva"), new Person("Manuel Pereira"), new Person("Aurora Machado"),
                new Person("Augusto Lima") };

        Company shark = new Company();
        Company.user = User.COMPANY;

        shark.admitEmployee(persons[0], 1000.0);
        shark.admitEmployee(persons[1], 900.0);
        shark.admitEmployee(persons[2], 1200.0);
        shark.admitEmployee(persons[3], 1100.0);
        
        List<Employee> sharkEmps = shark.employees();
        for (Employee e : sharkEmps)
            System.out.println(e.getSalary()); // e.getBankAccount().balance() works, proxy works as well
        shark.paySalaries(1);
    }
}