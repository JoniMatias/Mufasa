
public class BankAccontDatabase {

	public BankAccount login(String username, String password) {
		//Mock
		User user = new User("Joni", "Rajala", "JoniMatias", "password".hashCode(), 
				"FI", "05/12/1989", "0408404584", "jonimatiasrajala@gmail.com");
		BankAccount account = new BankAccount(user, 100);
		return account;
	}
	
	public BankAccount createAccountForUser(User user) {
		//Mock
		UserValidator validator = new UserValidator();
		if (validator.isUserValid(user)) {
			return new BankAccount(user, 0);
		}
		
		return null;
	}
	
}
