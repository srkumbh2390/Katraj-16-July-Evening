package testNG1;

import org.testng.annotations.Test;

public class Group1 {

	  @Test (groups="integration")
	  public void testCase3() {	  
		  System.out.println("test case 3");
	  }  
	  @Test (groups="integration")
	  public void testCase4() {	  
		  System.out.println("test case 4");
	  }
	  
	  @Test (groups="sanity")
	  public void handleAlert() {	  
		  System.out.println("Handle alert");
	  }
	}

