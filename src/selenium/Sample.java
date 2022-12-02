package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Sample {
	
	public static void chromeDriver() {
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		//step -1 create object of chrome driver
		WebDriver driver =new ChromeDriver();		
		
		//step-2 maximize
		driver.manage().window().maximize();		
		
		//step-3 open webpage
		driver.get("https://www.facebook.com");
	}

	public static void edgeDriver() {
		//set path require while creating driver instance 
				System.setProperty("webdriver.edge.driver", "D:\\test\\Selenium\\Driver\\edgedriver_win64\\msedgedriver.exe");
				
				//step -1 create object of edge driver
				WebDriver driver =new EdgeDriver();				
				
				//step-2 maximize
				driver.manage().window().maximize();				
				
				//step-3 open webpage
				driver.get("https://www.facebook.com/");
	}
	
	public static void firefoxDriver() {
		//set path require while creating driver instance 
		System.setProperty("webdriver.gecko.driver", "D:\\test\\Selenium\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
		//step -1 create object of firefox driver
		WebDriver driver =new FirefoxDriver();		
		
		//step-2 maximize
		driver.manage().window().maximize();		
		
		//step-3 open webpage
		driver.get("https://www.rediffmail.com");
	}
	public static void IEDriver() {
		//set path require while creating driver instance 
				System.setProperty("webdriver.ie.driver", "D:\\test\\Selenium\\Driver\\IEDriverServer_x64_4.3.0\\IEDriverServer.exe");
				
				//step -1 create object of InternetExplorer driver
				WebDriver driver =new InternetExplorerDriver();				
				
				//step-2 maximize
				driver.manage().window().maximize();				
				
				//step-3 open webpage
				driver.get("https://www.rediffmail.com");
	}
	public static void main(String[] args) {
		
		Sample.IEDriver();
				
	}

}
