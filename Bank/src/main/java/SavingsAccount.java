
public class SavingsAccount extends BankAccount {

	public SavingsAccount(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	// double balance;

	public void withdraw(double amount) {

		balance = balance - amount;

	}
	public void transfer(CheckingAccount ca, double amount) {
		
		ca.deposit(amount);
		this.withdraw(amount);
	}

}
