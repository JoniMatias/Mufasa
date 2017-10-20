
public class UserValidationError extends Exception {

	static final long serialVersionUID = 23;
	public String message;
	
	UserValidationError(String message) {
		this.message = message;
	}
	
}
