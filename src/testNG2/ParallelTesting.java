package testNG2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ParallelTesting {
	WebDriver driver;
	
	@BeforeClass
	public void initialization() throws InterruptedException {
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
			System.out.println("act Title Test Case is Passed");
		}
		else {
			System.out.println("act Title Test Case Failed");
		}
	}
	
	@Test
	public void verifyUrl() {
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println("Current URL : " + CurrentUrl);
		
		if (CurrentUrl.equals("https://www.facebook.com/")) {
			System.out.println("Current Url Test Case Is Passed");
		}
		else {
			System.out.println("Current Url Test Case is Failed");
		}
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
