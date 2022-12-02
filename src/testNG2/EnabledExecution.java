package testNG2;

import org.testng.annotations.Test;

public class EnabledExecution {

	@Test (enabled = false)
	public void verifyTitle() {
		System.out.println("Verify Title");
	}
	
	@Test
	public void clickabilityOfButton() {
		System.out.println("Clickability Of Button");
	}
	
	@Test  (enabled = false)
	public void loginFlow() {
		System.out.println("Login flow");
	}
	
	@Test
	public void enterCred() {
		System.out.println("Enter Cred");
	}
	
}
