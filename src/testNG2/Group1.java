package testNG2;

import org.testng.annotations.Test;

public class Group1 {

	@Test (groups="sanity")
	public void verifyTitle() {
		System.out.println("Verify Title");
	}
	
	@Test (groups="integration")
	public void clickabilityOfButton() {
		System.out.println("Clickability of Button");
	}
	
	@Test (groups="sanity")
	public void loginFlow() {
		System.out.println("Login Flow");
	}
	
	@Test  (groups="integration")
	public void enterCred() {
		System.out.println("Enter Cred");
	}
}
