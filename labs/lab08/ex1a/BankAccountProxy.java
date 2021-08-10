
public class BankAccountProxy implements BankAccount {

    private BankAccount bankAccount;

    public BankAccountProxy(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void deposit(double amount) {
        this.bankAccount.deposit(amount);
    }

    @Override
    // only the employee can access this information
    public boolean withdraw(double amount) {
        if (Company.user == User.OWNER)
            return this.bankAccount.withdraw(amount);
        
        System.out.println("User isn't allowed to withdraw");
        return false;
    }

    @Override
    // only the employee can access this information
    public double balance() {
        if (Company.user == User.OWNER)
            return this.bankAccount.balance();
        
        System.out.println("User isn't allowed to balance");
        return Double.NaN;
    }
}
