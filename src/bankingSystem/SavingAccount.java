package bankingSystem;

public class SavingAccount extends Account {

    private static final double SAVING_INTEREST_RATE = 4.5;

    public SavingAccount() {
    }

    public SavingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public double getSavingInterestRate(){
        return SavingAccount.SAVING_INTEREST_RATE;
    }

    @Override
    public void calculateInterest() {
        double savingBalance = 0.0;
        savingBalance = super.getBalance() + super.getBalance() * SAVING_INTEREST_RATE/100;
        System.out.println("Saving Account Balance: " + savingBalance);
    }
}