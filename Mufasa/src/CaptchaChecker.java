
public class CaptchaChecker {

	private int refreshCount;
	
	public CaptchaChecker() {
		refreshCount = 0;
	}
	
	public boolean changeCaptcha() {
		//mock
		refreshCount++;
		return refreshCount <= 4;
	}
	
	public boolean doesCaptchaMatch(String input) {
		//stub
		return true;
	}
	
}
