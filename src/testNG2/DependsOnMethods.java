package testNG2;

import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test (dependsOnMethods = "loginFlow")
	public void verifyTitle() {
		System.out.println("Verify Title");
	}
	
	@Test 
	public void clickabilityOfButton() {
		System.out.println("Clickability of Button");
	}
	
	@Test (dependsOnMethods = "enterCred")
	public void loginFlow() {
		System.out.println("Login Flow");
	}
	
	@Test (dependsOnMethods = "clickabilityOfButton")
	public void enterCred() {
		System.out.println("Apply Button");
	}
}
