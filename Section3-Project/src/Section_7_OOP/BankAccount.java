package Section_7_OOP;

public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner) {
        this(owner, 0);
    }

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Amount to deposit must be grater than 0");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount to deposit must be grater than 0" + "and less than your balance" + balance);
        }
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }




}
