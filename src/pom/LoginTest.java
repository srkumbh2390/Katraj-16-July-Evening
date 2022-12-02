package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	
	public WebDriver driver;
	LoginPage lp;
	
	public  void initObject() {
		
		lp=new LoginPage(driver);
	}
	
	@BeforeClass
	public void init() {
		
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");

		//step-1 launch instance 
		 driver = new ChromeDriver();
				
		//step-2 maximize window
		driver.manage().window().maximize();
		
		//step-3 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//step-4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//step-5 creating objects
		initObject();
		
		
	}
	
	@Test
	public void login() {
		//step-1 enter cred
		lp.enterCred("Admin", "admin123");
		System.out.println("user name & password entered successfully");
		
		//step-2
		lp.clickButton();
		System.out.println("successfully clicked on button");
		
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.close();
		System.out.println("Test class end");
	}

}
