
public class BankingTests {

	private BankAccountDatabase database;
	
	BankingTests(BankAccountDatabase db) {
		database = db;
	}
	
	public int testTransaction(User user) {
		
		BankAccount account = database.getBankAccountForUser(user);
		
		account.transaction(-1);
		
		account.hasBeenTested = true;
		
		return account.getBalance();
		
	}
	
	public int refundTestTransaction(User user) {
		BankAccount account = database.getBankAccountForUser(user);
		
		if (account.hasBeenTested) {
			account.transaction(1);
			
			account.hasBeenTested = false;
		}
		
		return account.getBalance();
	}
	
}
