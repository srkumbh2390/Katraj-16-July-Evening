package testNG1;

import org.testng.annotations.*;

public class Test1 {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}
	
	@BeforeTest
	public void beforeTest() {		
		System.out.println("before test");
	}
	
	@BeforeClass
	public void beforeClass() {		
		System.out.println("Before class");
	}
	
	@BeforeMethod
	public void beforeMethod() {		
		System.out.println("Before method");
	}
	
	@Test
	public void testCase1() {		
		System.out.println("test case1");		
	}
	@Test
	public void testCase2() {		
		System.out.println("test case2");		
	}
	
	@AfterMethod
	public void afterMethod() {		
		System.out.println("after method");
	}
	
	@AfterClass
	public void afterClass() {		
		System.out.println("after class");
	}
	
	@AfterTest
	public void afterTest() {		
		System.out.println("after test");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("After suite");
	}
}
