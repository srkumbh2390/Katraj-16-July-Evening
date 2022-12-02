package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Google {
	
WebDriver driver;
	
	@BeforeClass
	public void initialization() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		Thread.sleep(2000);
	}
	
	 @Test 
	  public void verifyTitle() throws InterruptedException {
		  String actualTitle = driver.getTitle();
		  
		  if (actualTitle.equals("Google")) {
			  System.out.println("Test case Passed");
		  }
		  else {
			  System.out.println("Test case Failed");
		  }
		  Thread.sleep(2000);
	  }
	 
	 @Test 
	  public void verifyUrl() throws InterruptedException {
		  String actualTitle = driver.getCurrentUrl();
		  
		  if (actualTitle.contains("google")) {
			  System.out.println("Test case Passed");
		  }
		  else {
			  System.out.println("Test case Failed");
		  }
		  Thread.sleep(2000);
	  }
	  
	  
	  @Test 
	  public void facebookLogoisDisplayed() throws InterruptedException {
		  WebElement googlelogo = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		  boolean googlelogoDisplayed = googlelogo.isDisplayed(); Thread.sleep(2000);
		  System.out.println(googlelogoDisplayed);
	  }
	  
	  @AfterClass
	  public void tearDown() throws InterruptedException {
		  Thread.sleep(5000);
		  driver.close();
	  }
}
