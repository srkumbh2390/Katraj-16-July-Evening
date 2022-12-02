package seleniumWebdriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledIsDisplayed {
	
	static String path = "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";
	
	public static void textEnabledGetting() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", path);
		System.out.println("-------------------Step-0-----------");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("-------------------Step-1-----------");	
		
		driver.manage().window().maximize();
		System.out.println("-------------------Step-2-----------");	
		
		driver.get("https://www.flipkart.com");
		System.out.println("-------------------Step-3-----------");	
		Thread.sleep(2000);
		
		WebElement Username = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		boolean EnabledUser = Username.isEnabled();
		System.out.println(EnabledUser);
		System.out.println("Username Enabled Status Checking");	
	
		boolean DisplayedUser = Username.isDisplayed();
		System.out.println(DisplayedUser);
		System.out.println("Username Displayed Status Checking");				
		System.out.println("-------------------Step-5-----------");	
		
		WebElement Password = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		boolean EnabledPass = Password.isEnabled();
		System.out.println(EnabledPass);
		System.out.println("Username Enabled Status Checking");	
		
		boolean DisplayedPass = Password.isDisplayed();
		System.out.println(DisplayedPass);
		System.out.println("Username Displayed Status Checking");				
		System.out.println("-------------------Step-6-----------");	
		
		Thread.sleep(5000);
		driver.quit();
		System.out.println("-------------------Step-7-----------");			
	}

	public static void main(String[] args) throws InterruptedException {
		
		textEnabledGetting();
	}

}
