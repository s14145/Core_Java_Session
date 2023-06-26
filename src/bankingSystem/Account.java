package bankingSystem;

public abstract class Account implements IAccount{

    private int accountNumber;

    private double balance;

    public Account() {
    }

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
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
    public double viewBalance() {
        return balance;
    }
}