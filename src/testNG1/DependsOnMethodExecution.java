package testNG1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExecution {
 
	@Test (dependsOnMethods="loginFlow") 
	  public void verifyTitle() {
		  
		  System.out.println("Verify title");
	  }
	  
	  @Test (dependsOnMethods="enterCred")
	  public void clickabilityOfButton() {
		  System.out.println("Clickability of button");
	  }
	  
	  @Test (dependsOnMethods="clickabilityOfButton")
	  public void loginFlow() {
		  System.out.println("Login flow");
		  Assert.assertFalse(true);
	  }
	  
	  @Test 
	  public void enterCred() {	  
		  System.out.println("enterCred");
	  }

}
