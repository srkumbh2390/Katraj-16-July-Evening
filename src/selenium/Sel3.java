package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel3 {

	public void verifyTitle() throws InterruptedException {
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		//step -1 create object of chrome driver
		WebDriver driver =new ChromeDriver();		
		
		//step-2 maximize
		driver.manage().window().maximize();		
		 
		//step-3 open webpage
		driver.get("https://www.facebook.com");
		
		// step 4 find element
		WebElement username = driver.findElement(By.id("email"));
		
		username.sendKeys("srk@gmail.com");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.name("pass"));		
		password.sendKeys("abc123");
		Thread.sleep(2000);
		
		//step 6
		driver.close();
		
	}
		public static void main(String[] args) throws InterruptedException {
		
			Sel3 var = new Sel3();
			var.verifyTitle();
	}

}
