package testNG1;

import org.testng.annotations.Test;

public class InvocationCount {
 
	  @Test (invocationCount=2)
	  public void verifyTitle() {	  
		  System.out.println("Verify title");
	  }
	  
	  @Test (invocationCount=3)
	  public void clickabilityOfButton() {
		  System.out.println("Clickability of button");
	  }
	  
	  @Test (invocationCount=2)
	  public void loginFlow() {
		  System.out.println("Login flow");
	  }
	  
	  @Test 
	  public void enterCred() {	  
		  System.out.println("enterCred");
	  }

}
