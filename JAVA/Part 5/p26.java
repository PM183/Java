/*Write a java program to generate user defined exception using “throw” and “throws” keyword.
Also Write a java that differentiates checked and unchecked exceptions. (Mention at least two checked and
two unchecked exceptions in program). */

// Define a custom exception class
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class p26 {
    private double balance;

    public p26(double balance) {
        this.balance = balance;
    }

    // Method that throws the custom exception
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance in account");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    public static void main(String[] args) {
        p26 account = new p26(1000.0);
        try {
            account.withdraw(1500.0);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
