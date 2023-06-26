package bankingSystem;

public class SavingAccount extends Account {

    private static final double SAVING_ACCOUNT_INTEREST_RATE = 4.5;

    public SavingAccount() {
    }

    public SavingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public double getSavingAccountInterestRate(){
        return SAVING_ACCOUNT_INTEREST_RATE;
    }

    @Override
    public void calculateInterest() {
        double savingAccountBalance = 0.0;
        savingAccountBalance = super.getBalance() + super.getBalance() * SAVING_ACCOUNT_INTEREST_RATE/100;
        System.out.println("Saving Account Balance: $" + savingAccountBalance);
    }
}