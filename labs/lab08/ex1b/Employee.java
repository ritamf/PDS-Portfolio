class Employee {
    private Person person;
    private double salary;
    private BankAccount bankAccount;

    public Employee(Person p, double s) {
        person = p;
        salary = s;
        bankAccount = new BankAccountImpl("PeDeMeia", 0);
    }

    public double getSalary() {
        return salary;
    }

    public BankAccount getBankAccount() {
        return new BankAccountProxy(  (BankAccount) (bankAccount)  );
    }
}