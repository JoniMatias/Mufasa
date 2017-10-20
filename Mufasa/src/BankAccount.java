
public class BankAccount {
	
	private int balance;
	public boolean hasBeenTested;
	
	BankAccount(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void transaction(int change) {
		balance += change;
	}
	
}
