package customexceptions;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        // Successful withdrawal
        try {
            account.withdraw(500);
            System.out.println("Withdrawal successful. New balance: " + account.getBalance());
        } catch (InsufficientFundsException | InvalidWithdrawalException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Attempting to withdraw more money than the account balance
        try {
            account.withdraw(600);
            System.out.println("Withdrawal successful. New balance: " + account.getBalance());
        } catch (InsufficientFundsException | InvalidWithdrawalException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Attempting to withdraw a negative amount
        try {
            account.withdraw(-200);
            System.out.println("Withdrawal successful. New balance: " + account.getBalance());
        } catch (InsufficientFundsException | InvalidWithdrawalException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
