package customexceptions;

public class BankAccount {
	
	    private double balance;

	    public BankAccount(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public void withdraw(double amount) throws InsufficientFundsException, InvalidWithdrawalException {
	        if (amount < 0) {
	            throw new InvalidWithdrawalException("Withdrawal amount cannot be negative.");
	        }
	        if (amount > balance) {
	            throw new InsufficientFundsException("Insufficient funds for withdrawal.");
	        }
	        balance -= amount;
	    }

	    public double getBalance() {
	        return balance;
	    }
	}