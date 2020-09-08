package bank;

public class BankAccount {
    public int number;
    private double balance;

    public BankAccount(int number, double balance){
        this.number = number;
        this.balance = balance;
    }

    public boolean deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
            return true;
        }
        return false;
    }

    public boolean withdrawal(double amount){
        if(balance < amount){
            return false;
        }
        balance = balance - amount;
        return true;
    }

    public double howMuchLeft(){
        return balance;
    }
}
