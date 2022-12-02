package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


public class Test1 {	
	
  @Test
  public void testCase3() {
	  System.out.println("Test Case 3");
  }
  
  @Test
  public void testCase4() {
	  System.out.println("Test Case 4");
  }
}
