package bankingSystem;

public interface IAccount {

    void deposit(double amount);

    void withdraw(double amount);

    void calculateInterest();

    double viewBalance();
}