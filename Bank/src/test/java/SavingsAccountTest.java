import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import junit.framework.TestCase;

public class SavingsAccountTest extends TestCase {

	@Test
	public void testGetBalance() {
		SavingsAccount savingsAccount = new SavingsAccount(0);
		System.out.println(savingsAccount.getBalance());
		assertTrue(savingsAccount.getBalance()==0);
	}
	
	public void testWithdraw() {
		SavingsAccount savingAccount = new SavingsAccount(100);
		savingAccount.withdraw(125);
		System.out.println(savingAccount.getBalance());
		assertTrue(savingAccount.getBalance()== -25);
	}
	
	public void testDeposite() {
		
		SavingsAccount savingAccount = new SavingsAccount(1000);
		savingAccount.deposit(500);
		System.out.println(savingAccount.getBalance());
		assertTrue(savingAccount.getBalance() == 1500);
	}
	
	public void testTransfer() {
		SavingsAccount savingAccount = new SavingsAccount(1000);
		CheckingAccount checkingAccount = new CheckingAccount(0);
		savingAccount.transfer(checkingAccount, 500);
		System.out.println("After transfer saving balance: " +savingAccount.getBalance());
		System.out.println("After transfer Checking balance: " + checkingAccount.getBalance());
		assertTrue(savingAccount.getBalance()==500);
		assertTrue(checkingAccount.getBalance()==500);
	}
	

}
