package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome1 {
	
	public static void chromeDriver1() {
		// set path require for creating driver instance
		System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");
		
		//step-1 crating object of chrome driver		
		WebDriver driver = new ChromeDriver();
		
		//step-2 maximize
		driver.manage().window().maximize();
		
		//step-3 open webpage
		driver.get("http://www.rediffmail.com");
		}

	public static void main(String[] args) {
		Chrome1.chromeDriver1();
	}

}
