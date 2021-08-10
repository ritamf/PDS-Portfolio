interface BankAccount {
    void deposit(double amount);

    // only the employee can access this information
    boolean withdraw(double amount);

    // only the employee can access this information
    double balance();
}