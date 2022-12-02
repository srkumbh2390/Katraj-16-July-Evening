package testNG2;

import org.testng.annotations.Test;

public class PriorityExecution {
	
	@Test (priority = 3)
	public void verifyTitle() {
		System.out.println("Verify Title");
	}
	
	@Test (priority = 2)
	public void clickabilityOfButton() {
		System.out.println("Clickability Of Button");
	}	
	
	@Test (priority = 1)
	public void loginFlow() {
		System.out.println("Login Flow");
	}
	
	@Test  (priority = 4)
	public void applyButton() {
		System.out.println("Apply Button");
	}

}
