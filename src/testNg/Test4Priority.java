package testNg;

import org.testng.annotations.Test;

public class Test4Priority {
	
	@Test (priority=1)
	  public void verifyTitle() {
		  System.out.println("Verify Title");
	  }
	  
	  @Test (priority=3)
	  public void clickabilityOfButton() {
		  System.out.println("Click ability of Button");
	  }
	  
	  @Test (priority=2)
	  public void loginFlow() {
		  System.out.println("Login Flow");
	  }
	  
	  @Test  (priority=4)
	  public void applyButton() {
		  System.out.println("Apply Button");
		  
	  }
}
