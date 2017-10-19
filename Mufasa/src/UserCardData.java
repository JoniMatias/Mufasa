
public class UserCardData {

	private String holderName;
	private String cardType;
	private String number;
	private String expiryDate;
	private int cvcHash;
	
	
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public int getCvcHash() {
		return cvcHash;
	}
	public void setCvc(String cvc) {
		this.cvcHash = cvc.hashCode();
	}
	public boolean checkCvc(String cvc) {
		return this.cvcHash == cvc.hashCode();
	}
	
	
}
