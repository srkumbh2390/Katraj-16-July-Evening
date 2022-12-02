package testNG2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (testNG2.TestngListeners11.class)
public class Listeners1 {
	WebDriver driver;
	
	@BeforeClass
	public void initialization() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		Thread.sleep(3000);
	}
	
	@Test (dependsOnMethods = "getButtonText")
	public void verifyTitle() {
		String webTitle = driver.getTitle();
		System.out.println("Web Title : " + webTitle);
		
		if (webTitle.equals("Facebook – log in or sign up")) {
			System.out.println("act Title Test Case is Passed");
		}
		else {
			System.out.println("act Title Test Case Failed");
		}		
	}
	
	@Test (description = "This test perform on chrome browser")
	public void verifyUrl() {
		String webURL = driver.getCurrentUrl();
		System.out.println("Web URL : " + webURL);		
		Assert.assertEquals(webURL, "https://www.facebook.com/");			
	}
	
	@Test 
	public void getButtonText() { 
		System.out.println("Test GetButtontext");
		Assert.assertTrue(false);
	}	

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
