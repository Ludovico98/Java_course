package Section_7_OOP;

import java.util.Scanner;

public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount PippoAccount = new BankAccount("Pippo", 1234);
        BankAccount PlutoAccount = new BankAccount("Pluto", 5678);


        System.out.println("the deposit must be grater than 0 and less than your balance");

        PippoAccount.deposit(200);
        System.out.println("owner: " + PippoAccount.getOwner());
        System.out.println("balance: " + PippoAccount.getBalance());

        PippoAccount.withdraw(10000);//warning;
        System.out.println("owner: " + PippoAccount.getOwner());
        System.out.println("balance: " + PippoAccount.getBalance());
        System.out.println();



        System.out.println("owner: " + PlutoAccount.getOwner());
        System.out.println("balance: " + PlutoAccount.getBalance());
        System.out.println();

        System.out.println("deposit 10000");
        PlutoAccount.deposit(10000);//warning;

        System.out.println("owner: " + PlutoAccount.getOwner());
        System.out.println("balance: " + PlutoAccount.getBalance());
        System.out.println();


    }

    public static void printAccounts(BankAccount bankAccount) {

    }

}
