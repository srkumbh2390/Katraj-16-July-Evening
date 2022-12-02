package testNG1;

import org.testng.annotations.Test;

public class Description {
	@Test (description="This is verfify title test case")
	  public void verifyTitle() {
		  
		  System.out.println("Verify title");
	  }
	  
	  @Test (description="This is test case for verification of button")
	  public void clickabilityOfButton() {
		  System.out.println("Clickability of button");
	  }
	  
	  @Test (description="This is login test")
	  public void loginFlow() {
		  System.out.println("Login flow");
	  }
	  
	  @Test (description ="This is enter cred test case")
	  public void enterCred() {	  
		  System.out.println("enterCred");
	  }
	}
