
public interface CaptchaChecker {
	
	public boolean changeCaptcha();
	
	public boolean doesCaptchaMatch(String input);
	
}
