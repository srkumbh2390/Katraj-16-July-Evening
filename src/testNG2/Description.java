package testNG2;

import org.testng.annotations.Test;

public class Description {
	
	@Test (description = "This is verity title test case")
	public void verifyTitle() {
		System.out.println("Verity Title");
	}
	
	@Test (description = "This is clickability of button test case")
	public void clickabilityOfButton() {
		System.out.println("clickablity of Button");
	}
	
	@Test (description = "This is login flow test case")
	public void loginFlow() {
		System.out.println("Login flow");
	}
	
	@Test  (description = "This is enter cred test case")
	public void enterCred() {
		System.out.println("Enter cred");
	}
}
