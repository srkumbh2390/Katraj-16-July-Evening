package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	
	public static void chromeDriver() {
		//set path require for creating driver instance
		System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");
		
		//step-1  crating object of chrome diver
		WebDriver driver = new ChromeDriver();
		
		//step-2 maximize
		driver.manage().window().maximize();
		
		//step-3  open webpage
		driver.get("https://www.facebook.com");
	}

	public static void main(String[] args) {
		
		Chrome.chromeDriver();
	}

}
