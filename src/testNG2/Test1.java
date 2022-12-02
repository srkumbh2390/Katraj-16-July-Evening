package testNG2;

import org.testng.annotations.*;

public class Test1 {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before Suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("before Test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before Method");
	}
	
	@Test
	public void testCase1() {
		System.out.println("test Case1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("test Case2");
	}
	
	@AfterMethod
	public void afterMethod() {	
		System.out.println("after Method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after Class");
	}
	
	@AfterTest 
	public void afterTest() {
		System.out.println("after Test");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after Suite");
	}
	
	}
