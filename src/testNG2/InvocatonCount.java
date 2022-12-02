package testNG2;

import org.testng.annotations.Test;

public class InvocatonCount {

	
	@Test (invocationCount=2)
	public void verifyTitle() {
		System.out.println("Verify Title");
	}
	
	@Test (invocationCount=3)
	public void clickabilityOfButton() {
		System.out.println("Clickability Of Button");
	}
	
	@Test 
	public void loginFlow() {
		System.out.println("Login Flow");
	}
	
	@Test (invocationCount=2)
	public void enterCred() {
		System.out.println("Enter Cred");
	}
}
