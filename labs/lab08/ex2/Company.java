import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Company { // Facade
    public static User user;

    private List<Employee> emps = new ArrayList<>();

    private SocialSecurity socialSecurity = new SocialSecurity();
    private Insurance insurance = new Insurance();
    private CardCreator cardCreator = new CardCreator();
    private Parking parking = new Parking();

    public Company() {}

    public void admitEmployee(Person person, double salary) { // Facade

        // 0. Registo na empresa
        Employee e = new Employee(person, salary);
        emps.add(e);

        // 1. Registo na segurança social (e.g. SocialSecurity.regist(person))
        socialSecurity.regist(person);

        // 2. Registo na seguradora (e.g. Insurance.regist(person))
        insurance.regist(person);

        // 3. Criação de um cartão de funcionário
        cardCreator.create(person);

        // 4. Autorização para use de parque automóvel caso o salário seja superior à média
        // (e.g. Parking.allow(person))
        parking.allow(e);

        System.out.println();

    }

    public void paySalaries(int month) {
        for (Employee e : emps) {
            BankAccount ba = e.getBankAccount();
            ba.deposit(e.getSalary());
        }
    }

    public List<Employee> employees() {
        return Collections.unmodifiableList(emps);
    }
}