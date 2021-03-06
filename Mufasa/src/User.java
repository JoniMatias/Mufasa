
public class User {

	private String firstName;
	private String lastName;
	private String userName;
	private String countryCode;
	private String dob;
	private String phoneNumber;
	private String emailAddress;
	
	private UserBankingRequirements bankingData;
	
	public User(String firstName, String lastName, String userName, String country, String dob,
			String phoneNumber, String email) {
		this(firstName, lastName, userName, country, dob, phoneNumber, email, null);
	}
	
	public User(String firstName, String lastName, String userName, String country, String dob,
			String phoneNumber, String email, UserBankingRequirements bankingData) {
		
		this.firstName = firstName;
		this.lastName  = lastName;
		this.userName  = userName;
		this.countryCode = country;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
		this.emailAddress = email;
		this.bankingData = bankingData;
		
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		if (firstName.matches("[a-zA-Z\\s]+")) {
			this.lastName = lastName;
		}
	}
	
	
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
	
	public String getCountryCode() {
		return countryCode;
	}
	
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	
	
	public String getDob() {
		return dob;
	}
	
	public void setDob(String dob) {
		this.dob = dob;
	}

	
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	

	
	public UserBankingRequirements getBankingData() {
		return bankingData;
	}

	public void setBankingData(UserBankingRequirements bankingData) {
		this.bankingData = bankingData;
	}

	
	
}
