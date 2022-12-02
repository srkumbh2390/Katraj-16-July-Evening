package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S1 {

	public static void main(String[] args) throws InterruptedException {
		
		// set path require while creating driver instance
		System.setProperty("webdriver.chrome.driver", "D:\\\\test\\\\Selenium\\\\Driver\\\\Chrome Driver\\\\chromedriver_win32\\\\chromedriver.exe");
		
		// step 1- creating object of chrome drive
		WebDriver driver = new ChromeDriver();
		
		// step-2 maximize the windows
		driver.manage().window().maximize();
		
		// step -3 open webpage
		driver.get("https://www.selenium.dev/downloads");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		}

}
