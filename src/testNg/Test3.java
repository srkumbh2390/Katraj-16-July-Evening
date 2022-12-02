package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test3 {
	WebDriver driver;
	
	@BeforeClass
	public void initialization() throws InterruptedException {
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");
		
		//step-1 launch instance 
		driver = new ChromeDriver();
		
		//step-2 maximize window
		driver.manage().window().maximize();
		
		//step-3 open webpage
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(5000);	
	}
  @Test
  public void verifyTitle() {
	  String actTitle = driver.getTitle();
	  System.out.println(actTitle);
	  
	  if(actTitle.equals("Practice Page")) {
		 System.out.println("Test Case Paseed");
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
