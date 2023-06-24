package bankingSystem;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accountList;

    public Bank() {
        accountList = new ArrayList<>();
    }

    public void addAccount(Account account){
        accountList.add(account);
    }

    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    public void withdraw(Account account, double amount){
        account.withdraw(amount);
    }

    public void viewAccountBalance(){
        for(Account account: accountList){
            System.out.println("Account balance: " + account.viewBalance());
        }
    }
}