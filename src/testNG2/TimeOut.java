package testNG2;

import org.testng.annotations.Test;

public class TimeOut {

	@Test
	public void verifyTitle() {
		System.out.println("Verify Title");
	}
	
	@Test (timeOut = 5000)
	public void clickabilityOfButton() throws InterruptedException {		
		System.out.println("Clickability Of Button");
		Thread.sleep(6000);
	}
	
	@Test 
	public void loginFlow () {
		System.out.println("Login Flow");
		
	}
	
	@Test
	public void enterCred() {
		System.out.println("Enter cred");
	}
}
