package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Facebook {
	WebDriver driver;
	
	@BeforeClass
	public void initialization() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		Thread.sleep(2000);
	}
	
  @Test
  public void verifyTitle() throws InterruptedException {
	  String actualTitle = driver.getTitle();
	  
	  if (actualTitle.contains("Facebook")) {
		  System.out.println("Test case Passed");
	  }
	  else {
		  System.out.println("Test case Failed");
	  }
	  Thread.sleep(2000);
  }
  
  @Test
  public void facebookLogoisDisplayed() throws InterruptedException {
	  WebElement fblogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	  boolean fblogoDisplayed = fblogo.isDisplayed(); Thread.sleep(2000);
	  System.out.println(fblogoDisplayed);
  }
  
  @Test 
  public void passwordFieldEnabled() throws InterruptedException {
	  WebElement passwordField = driver.findElement(By.id("pass"));
	  boolean passwordFieldEnabled = passwordField.isEnabled();  Thread.sleep(2000);
	  System.out.println(passwordFieldEnabled);
  }
  
  
  
  @AfterClass
  public void tearDown() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.close();
  }
  
}
