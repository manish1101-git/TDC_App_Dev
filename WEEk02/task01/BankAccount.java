public class BankAccount {
   
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = Math.max(initialBalance, 0.0); 
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited:\n", amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal denied.");
        } else {
            balance -= amount;
            System.out.printf("Withdrawn: \n", amount);
        }
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.printf("Balance: \n", balance);
    }

    // Main method
    public static void main(String[] args) {
        BankAccount account = new BankAccount("81202530", "Manish", 100.0);

        account.displayAccountDetails();
        account.deposit(50.0);
        account.withdraw(30.0);
        account.withdraw(150.0); 
        account.displayAccountDetails();
    }
}