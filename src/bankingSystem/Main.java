package bankingSystem;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();
        SavingAccount savingAccount = new SavingAccount(1001, 1000.0);
        System.out.println("\nYour Saving account information: ");
        System.out.println("Saving account number: " + savingAccount.getAccountNumber());
        System.out.println("Saving account balance: $" + savingAccount.getBalance());
        System.out.println("Saving account interest rate: " + savingAccount.getSavingAccountInterestRate());
        CurrentAccount currentAccount = new CurrentAccount(1002, 5000.0);
        System.out.println("\nYour Current account information: ");
        System.out.println("Current account number: " + currentAccount.getAccountNumber());
        System.out.println("Current account balance: $" + currentAccount.getBalance());
        System.out.println("Current account interest rate: " + currentAccount.geCurrentAccountInterestRate());

        bank.addAccount(savingAccount);
        bank.addAccount(currentAccount);

        System.out.println("\nDepositing $1000 to Saving Account:");
        bank.deposit(savingAccount, 1000.0);
        System.out.println("\nDepositing $2000 to Current Account:");
        bank.deposit(currentAccount, 2000.0);

        System.out.println("\nWithdraw $500 from Saving Account:");
        bank.withdraw(savingAccount, 500.0);
        System.out.println("\nWithdraw $1000 from Current Account:");
        bank.withdraw(currentAccount, 1000.0);

        System.out.println("\nSaving A/C and Current A/C Balances:");
        bank.viewAccountBalance();

        System.out.println("\nSaving A/C and Current A/C balances after calculating interest rates:");
        savingAccount.calculateInterest();
        currentAccount.calculateInterest();
    }
}