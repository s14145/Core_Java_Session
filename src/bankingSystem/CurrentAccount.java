package bankingSystem;

public class CurrentAccount extends Account {

    private static final double CURRENT_ACCOUNT_INTEREST_RATE = 1.3;

    public CurrentAccount() {
    }

    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public double geCurrentAccountInterestRate(){
        return CurrentAccount.CURRENT_ACCOUNT_INTEREST_RATE;
    }

    @Override
    public void calculateInterest() {
        double currentAccountBalance = 0.0;
        currentAccountBalance = super.getBalance() + super.getBalance() * CURRENT_ACCOUNT_INTEREST_RATE/100;
        System.out.println("Current Account Balance: " + currentAccountBalance);
    }
}