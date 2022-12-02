package testNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Parameters;

public class Parameter {
WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void initalization(String browserType) throws InterruptedException {
		
		if (browserType.equals("chrome")) {
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");

		//step-1 launch instance 
		driver = new ChromeDriver();
		}	
		else if (browserType.equals("edge")) {
			
		//set path require while creating driver instance 
		System.setProperty("webdriver.edge.driver", "D:\\test\\Selenium\\Driver\\All Driver\\msedgedriver.exe");

		//step-1 launch instance 
		 driver = new EdgeDriver();			
		}
		//step-2 maximize window
		driver.manage().window().maximize();
				
		//step-3 open webpage
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(5000);		
	}	
@Test (description="This test perform on chrome browser")
public void verifyTitle() {	
	String actTitle =driver.getTitle();
	System.out.println();
	
	 if (actTitle.equals("Practice Page")) {		 
		 System.out.println("test case passed");		 
	 }
	 else {		 
		 System.out.println("test acse failed");
	 }	
}
@Test (description="This test perform on chrome browser")
public void verifyURL() {	
	String actUrl = driver.getCurrentUrl();	
	Assert.assertEquals(actUrl, "https://vctcpune.com/selenium/practice.html");	
}	
@AfterClass
public void tearDown() throws InterruptedException {
	Thread.sleep(3000);
	driver.close();
}	
}
