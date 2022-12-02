package testNG1;

import org.testng.annotations.Test;

public class DefaultExecution {

	@Test
	  public void verifyTitle() {	  
		  System.out.println("Verify title");
	  }
	  
	  @Test
	  public void clickabilityOfButton() {
		  System.out.println("Clickability of button");
	  }
	  
	  @Test
	  public void loginFlow() {	  
		  System.out.println("Login flow");
	  }
	  
	  @Test
	  public void applyButton() {	  
		  System.out.println("Apply button");
	  }
	}


