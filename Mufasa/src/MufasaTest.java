import static org.junit.jupiter.api.Assertions.*;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.jupiter.api.Test;


class MufasaTest {

	private User user;
	
	@Before
	public void setup(){
		
		user = new User("Joni", "Rajala", "JoniMatias", "FI", "05/12/1989", "0408404584", "jonimatiasrajala@gmail.com");
	}
	
	
	@Test
	void testUserValidation_validUser() throws UserValidationError {
		
		User user = new User("Joni", "Rajala", "JoniMatias", "FI", "05/12/1989", "0408404584", "jonimatiasrajala@gmail.com");
		
		CountryCodeList countries = EasyMock.createMock(CountryCodeList.class);
		
		EasyMock.expect(countries.isCountryCodeValid("FI")).andReturn(true);
		EasyMock.replay(countries);
		
		UserValidator validator = new UserValidator(countries);
		
		boolean value = validator.isUserValid(user);
				
		assertEquals(true, value);
	}
	
	@Test
	void testTesting() throws UserValidationError {
		
		BankAccountDatabase accountDB = EasyMock.createMock(BankAccountDatabase.class);
		BankAccount account = new BankAccount(100);
		
		EasyMock.expect(accountDB.getBankAccountForUser(user)).andReturn(account);
		EasyMock.replay(accountDB);
		
		BankingTests tests = new BankingTests(accountDB);
		
		int balance = tests.testTransaction(user);
		
		assertEquals(99, balance);
		
	}
	
	@Test
	void testTestingRefund() throws UserValidationError {
		
		BankAccountDatabase accountDB = EasyMock.createMock(BankAccountDatabase.class);
		BankAccount account = new BankAccount(100);
		account.hasBeenTested = true;
		
		EasyMock.expect(accountDB.getBankAccountForUser(user)).andReturn(account);
		EasyMock.replay(accountDB);
		
		BankingTests tests = new BankingTests(accountDB);
		
		int balance = tests.refundTestTransaction(user);
		
		assertEquals(101, balance);
		
	}

}
