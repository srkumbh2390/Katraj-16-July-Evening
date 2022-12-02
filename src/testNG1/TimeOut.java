package testNG1;

import org.testng.annotations.Test;

public class TimeOut {
 
	@Test 
	  public void verifyTitle() {	  
		  System.out.println("Verify title");
	  }
	  
	  @Test 
	  public void clickabilityOfButton() {
		  System.out.println("Clickability of button");
	  }
	  
	  @Test (timeOut=5000)
	  public void loginFlow() throws InterruptedException {
		  System.out.println("Login flow");
		  Thread.sleep(4000);
	  }
	  
	  @Test 
	  public void enterCred() {	  
		  System.out.println("enterCred");
	  }

	
}
