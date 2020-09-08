package atm;

import bank.BankAccount;

public class ATM {
    private int id;
    public ATM(int id){
        this.id = id;
    }

    public void withdraw(BankAccount account, double amount){
        boolean result = account.withdrawal(amount);
        if(result){
            System.out.println("Withdrawal of $" + amount + " succesful");
        }else{
            System.out.println("Not enough funds on account in ATM");
        }
    }

    public void deposit(BankAccount account, double amount){
        boolean result = account.deposit(amount);
        double amountLeft = account.howMuchLeft();
        if(result){
            System.out.println("$"+amount+"was succesful and we have on account: $" + amountLeft);
        }else{
            System.out.println("ATM got an error");
        }
    }
}
