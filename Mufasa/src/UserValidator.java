
public class UserValidator {
	
	public boolean isUserValid(User user) {
		return true;
	}
	
	public boolean isUserValidForBankAccount(User user) {
		return true;
	}
	
	private boolean isNameValid(String name) {
		return name.matches("[a-zA-Z\\s]+");
	}
	
	private boolean isUserNameValid(User user) {
		if (user.getUserName().length() > 15) return false;
		if (user.getUserName().length() - user.getUserName().replace("_", "").length() >= 2) return false;
		
		return true;
	}
	
	private boolean isCountryValid(User user) {
		CountryCodeList codeList = new CountryCodeList();
		return codeList.isCountryCodeValid(user.getCountryCode());
	}
	
	private boolean isPhoneNumberValid(User user) {
		return user.getPhoneNumber().matches("[0-9\\s]+");
	}
	
	
}
