package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
	
	public static void firefoxDriver() {
		//set path require for creating driver instance
		System.setProperty("webdriver.gecko.driver", "D:\\test\\Selenium\\Driver\\All Driver\\geckodriver.exe");
		
		// step-1 crating object of firefox driver
		WebDriver ref = new FirefoxDriver();
		
		//step-2 maximize
		ref.manage().window().maximize();
		
		//step-3 open webpage
		ref.get("http://www.facebook.com");
		
	}

	public static void main(String[] args) {
		Firefox.firefoxDriver();

	}

}
