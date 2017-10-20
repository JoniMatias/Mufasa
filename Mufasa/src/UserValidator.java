
public class UserValidator {
	
	public CountryCodeList countryList;
	
	public UserValidator(CountryCodeList codeList) {
		countryList = codeList;
	}
	
	public boolean isUserValid(User user) throws UserValidationError {
		//if (!isNameValid(user.getFirstName())) return false;
		//if (!isNameValid(user.getLastName()))  return false;
		if (!isUserNameValid(user))            return false;
		if (!isCountryValid(user))             return false;
		//if (!isPhoneNumberValid(user))         return false;
		
		return true;
	}
	
	public boolean isUserValidForBankAccount(User user) {
		return true;
	}
	
	private boolean isNameValid(String name) throws UserValidationError {
		if (name.matches("[a-zA-Z\\s]+")) {
			return true;
		} else {
			throw new UserValidationError("Names can only contain letters and spaces.");
		}
	}
	
	private boolean isUserNameValid(User user) throws UserValidationError {
		if (user.getUserName().length() > 15) {
			throw new UserValidationError("Username must be less than 15 characters.");
		}
		if (user.getUserName().length() - user.getUserName().replace("_", "").length() >= 2) {
			throw new UserValidationError("Username can only contain one underscore.");
		}
		
		return true;
	}
	
	private boolean isCountryValid(User user) throws UserValidationError {
		if (countryList.isCountryCodeValid(user.getCountryCode())) {
			return true;
		} else {
			throw new UserValidationError("Please select a country.");
		}
	}
	
	private boolean isPhoneNumberValid(User user) throws UserValidationError {
		if (user.getPhoneNumber().matches("[0-9\\s]+")) {
			return true;
		} else {
			throw new UserValidationError("Names can only contain letters and spaces.");
		}
	}
	
	
	
	private boolean isAddressValid(User user) throws UserValidationError {
		Address address = user.getBankingData().getAddress();
		if (address.getStreetAddress().matches("[a-zA-Z0-9\\s]+") &&
			address.getCity().matches("[a-zA-Z\\s]+") &&
			address.getPostalCode().matches("[0-9-]+") &&
			countryList.isCountryCodeValid(address.getCountry())) {
			
			return true;
		} else {
			throw new UserValidationError("Address details are wrong.");
		}
	}
	
	
	
}
