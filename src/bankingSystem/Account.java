package bankingSystem;

public interface Account {

    void deposit(double amount);

    void withdraw(double amount);

    void calculateInterest();

    double viewBalance();
}