// INTERFACE - defines a contract (full abstraction)
interface Transaction {
    void deposit(double amount);
    void withdraw(double amount);
}

// ABSTRACT CLASS - provides partial implementation (common code)
abstract class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Concrete method (common for all accounts)
    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }

    // Abstract method - must be implemented by subclass
    abstract void calculateInterest();
}

// Concrete class that extends abstract class and implements interface
class SavingsAccount extends BankAccount implements Transaction {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Implementing abstract method from abstract class
    void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: ₹" + interest);
    }

    // Implementing methods from interface
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " to Savings Account.");
    }

    public void withdraw(double amount) {
        if (balance - amount >= 500) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from Savings Account.");
        } else {
            System.out.println("Minimum balance of ₹500 must remain.");
        }
    }
}

public class InterfacevsAbstractClass {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("S1001", 2000, 5);

        System.out.println("Using Interface Methods");
        sa.deposit(1000);
        sa.withdraw(1200);

        System.out.println("\nUsing Abstract Class Methods");
        sa.calculateInterest();
        sa.displayBalance();
    }
}

