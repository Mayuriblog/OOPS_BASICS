// Abstract class
abstract class BankAccount {
    String accountNumber;
    double balance;

    // Constructor
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Abstract method (must be implemented by subclasses)
    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    // Concrete (non-abstract) method
    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }
}

// Subclass 1: SavingsAccount
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " to Savings Account");
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= 500) { // minimum balance condition
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from Savings Account");
        } else {
            System.out.println("Insufficient balance! Minimum ₹500 must remain.");
        }
    }

    void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: ₹" + interest);
    }
}

// Subclass 2: CurrentAccount
class CurrentAccount extends BankAccount {
    double overdraftLimit;

    CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " to Current Account");
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from Current Account");
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}

// Main class to test
public class BankAccountExample {
    public static void main(String[] args) {
        System.out.println("=== Savings Account ===");
        SavingsAccount sa = new SavingsAccount("S12345", 2000, 5);
        sa.displayBalance();
        sa.deposit(1000);
        sa.withdraw(800);
        sa.addInterest();
        sa.displayBalance();

        System.out.println("\n=== Current Account ===");
        CurrentAccount ca = new CurrentAccount("C67890", 5000, 2000);
        ca.displayBalance();
        ca.withdraw(6000);
        ca.deposit(2000);
        ca.displayBalance();
    }
}
