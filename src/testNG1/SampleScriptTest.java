package testNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class SampleScriptTest {
  
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
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(5000);		
	}  
	
@Test
public void verifyTitle() {
	
	String actTitle =driver.getTitle();
	System.out.println("Actual Title of Page : " + actTitle);
	
	 if (actTitle.equals("Practice Page")) {		 
		 System.out.println("test case passed");		 
	 }
	 else {		 
		 System.out.println("test acse failed");
	 }	
}
	
@AfterClass
public void tearDown() throws InterruptedException {
	Thread.sleep(3000);
	driver.close();
}	
}
