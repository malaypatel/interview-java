
public class BankAccount {
	
	public double balance;
	
	

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}

	

	public void deposit(double amount) {
		balance = balance + amount;

	}

	public double getBalance() {
		return balance;
	}
	
}
