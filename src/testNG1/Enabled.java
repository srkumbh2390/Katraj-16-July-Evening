package testNG1;

import org.testng.annotations.Test;

public class Enabled {
  
	@Test (enabled=false) 
	  public void verifyTitle() {	  
		  System.out.println("Verify title");
	  }
	  
	  @Test 
	  public void clickabilityOfButton() {
		  System.out.println("Clickability of button");
	  }
	  
	  @Test (enabled=false)
	  public void loginFlow() {
		  System.out.println("Login flow");
	  }
	  
	  @Test 
	  public void enterCred() {	  
		  System.out.println("enterCred");
	  }

	
}
