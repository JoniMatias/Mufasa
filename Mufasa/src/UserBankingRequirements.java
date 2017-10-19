
public class UserBankingRequirements {

	private int passwordHash;
	private String streetAddress;
	private UserCardData card;
	
	
	
	public int getPasswordHash() {
		return passwordHash;
	}
	public void setPasswordHash(int passwordHash) {
		this.passwordHash = passwordHash;
	}
	
	
	
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	
	
	public UserCardData getCard() {
		return card;
	}
	public void setCard(UserCardData card) {
		this.card = card;
	}
	
	
	
}
