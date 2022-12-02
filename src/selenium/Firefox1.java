package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox1 {
	
	public static void firefoxDriver1 () {
		
		System.setProperty("webdriver.gecko.driver", "D:\\test\\Selenium\\Driver\\All Driver\\geckodriver.exe");
		
		WebDriver var = new FirefoxDriver();
		
		var.manage().window().maximize();
		
		var.get("http://www.rediffmail.com");
		
	}	

	public static void main(String[] args) {
		
		Firefox1.firefoxDriver1();
	}

}
