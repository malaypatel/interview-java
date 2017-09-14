import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class SavingsAccountTest {

	@Test
	public void testGetBalance() {
		SavingsAccount savingsAccount = new SavingsAccount();
		assertNotNull(savingsAccount);
	}
	

}
