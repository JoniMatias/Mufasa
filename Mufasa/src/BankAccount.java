
public class BankAccount {

	private User user;
	private int balance;
	
	public BankAccount(User user, int balance) {
		this.user    = user;
		this.balance = balance;
	}
	
	public void addFunds(int funds) {
		//Mock
		balance += funds;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public User getUser() {
		return user;
	}
	
}
