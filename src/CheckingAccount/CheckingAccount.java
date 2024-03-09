package CheckingAccount;

public class CheckingAccount {
    private double balance;

    // Default constructor
    public CheckingAccount() {
        this.balance = 0.0;
    }

    // Constructor with parameters
    public CheckingAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Copy constructor
    public CheckingAccount(CheckingAccount anotherAccount) {
        this.balance = anotherAccount.getBalance();
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
    }

    // Withdrawal method
    public void withdrawal(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    // Refund method
    public void refund(double amount) {
        deposit(amount);
    }

    // Transfer method
    public void transfer(double amount, CheckingAccount destinationAccount) {
        withdrawal(amount);
        destinationAccount.deposit(amount);
    }

    // Getter to retrieve the balance
    public double getBalance() {
        return balance;
    }

    // Setter to set the balance
    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }
}

