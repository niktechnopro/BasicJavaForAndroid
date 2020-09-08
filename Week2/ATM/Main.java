import bank.BankAccount;
import bank.BankTeller;
import atm.ATM;

public class Main {

    public static void main(String[] args) {
        //creating 2 accounts
        BankAccount accountOne = new BankAccount( 1234, 100.00 );
        BankAccount accountTwo = new BankAccount (1234, 200.00);
        //end of creating 2 accounts
        //creating bank teller
        BankTeller john = new BankTeller();
        //end of creating bank teller

        //bank teller actions
        john.deposit(accountTwo, 50.00);
        john.withdrawal(accountTwo, 27.00);
        //money transfer from accountTwo to accountOne
        System.out.println("Transferring from account Two to account One:");
        john.transferMoney(accountTwo, accountOne, 81);//from accountOne to accountTwo

        //money transfer from accountOne to accountTwo
        System.out.println("Transferring from account One to account Two:");
        john.transferMoney(accountOne, accountTwo, 93);//from accountOne to accountTwo
        //end of bank teller actions

        //atm machine
        ATM xyz = new ATM(333);
        xyz.withdraw(accountOne, 70.23);
        xyz.deposit(accountTwo, 15.34);
        //end of atm machine
    }
}
