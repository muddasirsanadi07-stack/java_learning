/**
 * Lesson: a private balance cannot be changed directly by callers. Methods
 * define the controlled operations available to users of the account.
 */
public class BankAccountExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(10_000);
        System.out.println("Balance: " + account.getBalance());
        account.deposit(500);
        System.out.println("After deposit: " + account.getBalance());
    }
}

class BankAccount {
    private int balance;

    BankAccount(int openingBalance) {
        if (openingBalance < 0) {
            throw new IllegalArgumentException("Opening balance cannot be negative.");
        }
        balance = openingBalance;
    }

    int getBalance() {
        return balance;
    }

    void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be positive.");
        }
        balance += amount;
    }
}
