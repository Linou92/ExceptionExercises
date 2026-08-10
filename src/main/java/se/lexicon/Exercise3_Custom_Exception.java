package se.lexicon;

public class Exercise3_Custom_Exception {

    void bank(){
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        try {
            account.withdraw(300);
        } catch (InsufficientBalanceException | IllegalArgumentException e) {
            IO.println(e.getMessage());
        }

        try {
            account.withdraw(1500);
        } catch (InsufficientBalanceException | IllegalArgumentException e) {
            IO.println(e.getMessage());
        }

        try {
            account.deposit(-20);
        } catch (IllegalArgumentException e) {
            IO.println(e.getMessage());
        }

        try {
            account.deposit(50);
        } catch (IllegalArgumentException e) {
            IO.println(e.getMessage());
        }
        IO.println("Final balance: " + account.getBalance());
    }
}
