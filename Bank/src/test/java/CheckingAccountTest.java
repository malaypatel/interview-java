import org.junit.Test;

import junit.framework.TestCase;

public class CheckingAccountTest extends TestCase{
    
	@Test
	public void testGetBalance() {
		CheckingAccount checkingAccount = new CheckingAccount(1000);
		System.out.println(checkingAccount.getBalance());
		assertTrue(checkingAccount.getBalance()==1000);
	}
	
	public void testWithdraw() {
		CheckingAccount checkingAccount = new CheckingAccount(1000);
		checkingAccount.withdraw(1500);
		System.out.println(checkingAccount.getBalance());
		assertTrue(checkingAccount.getBalance()== 995);
		System.out.println(checkingAccount.getBalance());
	}
	
	public void testDeposite() {
		
		CheckingAccount checkingAccount = new CheckingAccount(1000);
		checkingAccount.deposit(500);
		System.out.println(checkingAccount.getBalance());
		assertTrue(checkingAccount.getBalance() == 1500);
	}
	
	public void testTransfer() {
		SavingsAccount savingAccount = new SavingsAccount(0);
		CheckingAccount checkingAccount = new CheckingAccount(1000);
		checkingAccount.transfer(savingAccount, 500);
		assertTrue(savingAccount.getBalance() == 500);
		assertTrue(checkingAccount.getBalance()== 500);
	}
	
}
