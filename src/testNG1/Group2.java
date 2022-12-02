package testNG1;

import org.testng.annotations.Test;

public class Group2 {
	@Test (groups="sanity")
	  public void verifyTitle() {	  
		  System.out.println("Verify title");
	  }  
	  @Test (groups="integration")
	  public void clickabilityOfButton() {
		  System.out.println("Clickability of button");
	  }  
	  @Test (groups="integration")
	  public void loginFlow() throws InterruptedException {
		  System.out.println("Login flow");	  
	  }  
	  @Test (groups="sanity")
	  public void enterCred() {	  
		  System.out.println("enterCred");
	  }
	}

