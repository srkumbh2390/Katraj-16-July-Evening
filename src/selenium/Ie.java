package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Ie {
	
	public static void IEDriver() {
		
		System.setProperty("webdriver.ie.driver", "D:\\test\\Selenium\\Driver\\IEDriverServer_x64_4.3.0\\IEDriverServer.exe");
		
		WebDriver ref = new InternetExplorerDriver();
		
		ref.manage().window().maximize();
		
		ref.get("http://www.facebook.com/");
	}

	public static void main(String[] args) {
		
		Ie.IEDriver();
	}

}
