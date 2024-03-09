package CheckingAccount;

public class Main {
    public static void main(String[] args) {
        CheckingAccount account1 = new CheckingAccount(1500); // Starting balance of $1500.0
        CheckingAccount account2 = new CheckingAccount(); // Default starting balance of $500.0

        System.out.println("Balance of account1: " + account1.getBalance());
        System.out.println("Balance of account2: " + account2.getBalance());

        account1.withdrawal(700); // Withdraw $700.0 from account1
        System.out.println("Balance of account1 after withdrawal: " + account1.getBalance());

        account2.deposit(300); // Deposit $300.0 into account2
        System.out.println("Balance of account2 after deposit: " + account2.getBalance());

        account1.transfer(400, account2); // Transfer $400.0 from account1 to account2
        System.out.println("Balance of account1 after transfer: " + account1.getBalance());
        System.out.println("Balance of account2 after transfer: " + account2.getBalance());
    }
}

