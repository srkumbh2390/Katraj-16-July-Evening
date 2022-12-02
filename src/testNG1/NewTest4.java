package testNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest4 {
public static WebDriver driver;
	
	@BeforeClass
	public void initalization() throws InterruptedException {
		
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Slenium Jar\\Chrome_107\\chromedriver.exe");

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
		driver.navigate().to("https://vctcpune.com/selenium/practice.html");
		
		String actTitle =driver.getTitle();		
		System.out.println(actTitle);		
		Assert.assertEquals(actTitle, "Facebook");
	}	
	@Test
	public void changeURL()  {
		String actTitle =driver.getTitle();		
		System.out.println(actTitle);		
		Assert.assertEquals(actTitle, "VCTC Practice pge");
	}	
	@AfterClass
	public void tearDown() {		
		driver.close();
	}
}

