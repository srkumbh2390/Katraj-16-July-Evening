package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Test4DependsOnMethod {
	
	  @Test (dependsOnMethods="loginFlow")
	  public void verifyTitle() {
		  System.out.println("Verify Title");
	  }
	  
	  @Test (dependsOnMethods="enterCred")
	  public void clickabilityOfButton() {
		  System.out.println("Click ability of Button");
	  }
	  
	  @Test (dependsOnMethods="clickabilityOfButton")
	  public void loginFlow() {
		  System.out.println("Login Flow");
		  Assert.assertFalse(true);
	  }
	  
	  @Test 
	  public void enterCred() {
		  System.out.println("Enter Cred");
		  
	  }
}
