package bankingSystem;

public class CurrentAccount extends Account {

    private static final double CURRENT_INTEREST_RATE = 1.3;

    public CurrentAccount() {
    }

    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public double geCurrentInterestRate(){
        return CurrentAccount.CURRENT_INTEREST_RATE;
    }

    @Override
    public void calculateInterest() {
        double currentBalance = 0;
        currentBalance = super.getBalance() + super.getBalance() * CURRENT_INTEREST_RATE/100;
        System.out.println("Current Account Balance: " + currentBalance);
    }
}