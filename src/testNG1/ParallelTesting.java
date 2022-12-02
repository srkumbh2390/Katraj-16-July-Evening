package testNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParallelTesting {
	WebDriver driver;
	
	@BeforeClass
	public void initalization() throws InterruptedException {
		
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");

		//step-1 launch instance 
		 driver = new ChromeDriver();
				
		//step-2 maximize window
		driver.manage().window().maximize();
				
		//step-3 open webpage
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);		
	}  
	
@Test
public void verifyTitle() {
	
	String actTitle =driver.getTitle();
	System.out.println(actTitle);
	
	 if (actTitle.equals("Facebook – log in or sign up")) {		 
		 System.out.println("test case passed");
		 
	 }
	 else {		 
		 System.out.println("test case failed");
	 }	
}

@Test
public void verifyURL() {
	
	String actUrl = driver.getCurrentUrl();	
	System.out.println("Actual Url : " + actUrl);
	Assert.assertEquals(actUrl, "https://www.facebook.com/");	
}
	
@AfterClass
public void tearDown() throws InterruptedException {
	Thread.sleep(3000);
	driver.close();
}	
}

