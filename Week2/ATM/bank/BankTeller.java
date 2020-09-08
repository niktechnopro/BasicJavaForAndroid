package bank;

public class BankTeller {
    public void deposit(BankAccount account, double amount){
        boolean result = account.deposit(amount);
        if(result){
            System.out.println("Succesful deposit of $" + amount);
        }else{
            System.out.println("Error on deposit");
        }
    }

    public double withdrawal(BankAccount account, double amount){
        boolean result = account.withdrawal(amount);
        double balance = account.howMuchLeft();
        if(result){
            System.out.println("Successful withdrawal of $" + amount);
            System.out.println("The balance left on the account: $"+ balance);
            return balance;
        }else{
            System.out.println("Not enough funds to withdraw, you only have: " + balance);
            return 0.0;
        }
    }

    public void transferMoney(BankAccount accountOne, BankAccount accountTwo, double amount){//from accountOne to accountTwo
       boolean possible = accountOne.howMuchLeft() > accountTwo.howMuchLeft();
       boolean fiftyPersentCondition = (accountOne.howMuchLeft() - amount) >= accountOne.howMuchLeft()/2;
       if (possible && fiftyPersentCondition){
           this.withdrawal(accountOne, amount);
           this.deposit(accountTwo, amount);
           System.out.println("Now on account we transferred from the balance is: " + accountOne.howMuchLeft());
           System.out.println("Now on account we transferred to the balance is: " + accountTwo.howMuchLeft());
       }else{
           System.out.println("Not enough funds on first account to transfer");
       }
    }
}
