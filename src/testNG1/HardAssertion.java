package testNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HardAssertion {
public static WebDriver driver;
	
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
	public void verifyTitle1() {
		//driver.navigate().to("https://vctcpune.com/selenium/practice.html");
		
		String actTitle =driver.getTitle();		
		System.out.println(actTitle);		
		Assert.assertEquals(actTitle, "ok – log in or sign up", "Title does not matched");		
		System.out.println("after assertion");
	}	
	@Test
	public void verifyURL()  {		
		String actUrl = driver.getCurrentUrl();
	   
		//assertion
		Assert.assertEquals(actUrl, "https://www.facebook.com/","URL does not match");		
	}	
	@Test
	public void isButtonPresent() {		
		WebElement button = driver.findElement(By.name("login"));		
		boolean state = button.isDisplayed();
		
		//assertion
		Assert.assertTrue(state, "Button not avaible in webpage");		
	}	
	@AfterClass
	public void tearDown() {
		
		driver.close();
	}
}

