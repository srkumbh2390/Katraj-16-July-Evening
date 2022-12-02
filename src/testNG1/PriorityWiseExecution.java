package testNG1;

import org.testng.annotations.Test;

public class PriorityWiseExecution {
  
	  @Test (priority=3)
	  public void verifyTitle() {	  
		  System.out.println("Verify title");
	  }
	  
	  @Test (priority=4)
	  public void clickabilityOfButton() {
		  System.out.println("Clickability of button");
	  }
	  
	  @Test (priority=2)
	  public void loginFlow() {	  
		  System.out.println("Login flow");
	  }
	  
	  @Test (priority=1)
	  public void applyButton() {	  
		  System.out.println("Apply button");
	  }	
}
