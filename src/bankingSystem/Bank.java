package bankingSystem;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<IAccount> accountList;

    public Bank() {
        accountList = new ArrayList<>();
    }

    public void addAccount(IAccount account){
        accountList.add(account);
    }

    public void deposit(IAccount account, double amount) {
        account.deposit(amount);
    }

    public void withdraw(IAccount account, double amount){
        account.withdraw(amount);
    }

    public void viewAccountBalance(){
        for(IAccount account: accountList){
            System.out.println("Account balance: " + account.viewBalance());
        }
    }
}