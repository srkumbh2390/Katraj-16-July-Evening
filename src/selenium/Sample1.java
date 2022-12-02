package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	
	public static void chromeDriver() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");
		System.out.println("-----------------------------Step-1 ----------------------------");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("-----------------------------Step-2 ----------------------------");
		
		driver.manage().window().maximize();
		System.out.println("-----------------------------Step-3 ----------------------------");
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(5000);
		System.out.println("-----------------------------Step-4 ----------------------------");		
		
		driver.navigate().to("http://www.facebook.com");
		Thread.sleep(3000);
		System.out.println("-----------------------------Step-5 ----------------------------");
		
		driver.manage().window().minimize();
		Thread.sleep(3000);
		System.out.println("-----------------------------Step-6 ----------------------------");			

		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("-----------------------------Step-7 ----------------------------");
		
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println("-----------------------------Step-8 ----------------------------");
		
		driver.navigate().forward();
		Thread.sleep(3000);		
		System.out.println("-----------------------------Step-9 ----------------------------");
		
		driver.close();		
		System.out.println("-----------------------------Step-10 ----------------------------");
	}

	public static void main(String[] args) throws InterruptedException {
		
		Sample1.chromeDriver();
		
		

	}

}
