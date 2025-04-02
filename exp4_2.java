
// BankAccount class demonstrating access specifiers
class BankAccount {
    private double balance;  // Private variable to store account balance

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Protected method to withdraw money
    protected void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Default-access method to check balance
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Subclass to test protected method
class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public void withdrawFunds(double amount) {
        withdraw(amount); // Accessing protected method
    }
}

// Main class to test functionality
public class exp4_2 {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account = new BankAccount(1000);

        // Accessing public method (Allowed)
        account.deposit(500);

        // Accessing default-access method (Allowed, because it's in the same package)
        account.checkBalance();

        // Creating a subclass object to access protected method
        SavingsAccount savings = new SavingsAccount(2000);
        savings.withdrawFunds(300); // ✅ Allowed, since it's accessed through inheritance
    }
}
