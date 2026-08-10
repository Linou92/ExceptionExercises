package se.lexicon;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {

        if (amount <= 0 ){
            throw new IllegalArgumentException("❌ Deposit amount must be positive!");
        }
        balance += amount;
        IO.println("Deposit successful. New balance: " + balance);
    }


    public void withdraw(double amount) throws InsufficientBalanceException{

        if (amount <= 0){
            throw new IllegalArgumentException("❌ Withdraw amount must be greater than 0");
        }

        if (amount > balance){
            throw new InsufficientBalanceException("❌ Insufficient funds for withdrawal");
        }

        balance -= amount;
        IO.println("✅ Withdrawal successful. New balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}
