
public class CheckingAccount extends BankAccount {
	// double balance;

	public CheckingAccount(double balance) {
		super(balance);

	}

	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Penlaty for withdrawing amount is $5 ");
			balance = balance - 5;
		} else {
			balance = balance - amount;
		}

	}
	
	public void transfer(SavingsAccount sa, double amount) {
		sa.deposit(amount);
		this.withdraw(amount);
	}

}
