package bankingSystem;

public class SavingAccount implements Account{

    private int accountNumber;

    private double balance;

    private double interestRate;


    public SavingAccount() {
    }

    public SavingAccount(int accountNumber, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void deposit(double amount) {
        if(amount <= 0){
            System.out.println("Invalid amount!!!");
        }
        balance += amount;
        System.out.println("Deposited amount $" + amount + " successfully");
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= 0){
            System.out.println("Invalid amount!!!");
        }else if(amount > balance){
        System.out.println("Unsufficient Funds!!!");
        }
        balance -= amount;
        System.out.println("Withdraw amount $" + amount + " successful");
    }

    @Override
    public void calculateInterest() {
        balance += balance * interestRate/100;
    }

    @Override
    public double viewBalance() {
        return balance;
    }
}