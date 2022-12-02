package testNG2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTestScript {	
	
	public WebDriver driver;
	@BeforeClass
	public void initilization() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com/");
		Thread.sleep(5000);
	}
	
	@Test
	public void verifyTitle() {
		String actTitle = driver.getTitle();
		System.out.println("Actual Title : " + actTitle);
		
		if (actTitle.equals("Facebook – log in or sign up")) {
			System.out.println("Test Case Passed");				
		}
		else {
			System.out.println("Test Case Failed");
		}
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();		
	}
}
