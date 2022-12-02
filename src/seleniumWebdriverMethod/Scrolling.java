package seleniumWebdriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	
	static String path = "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";
	
	public static void scroll() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", path);
		System.out.println("-------------------Step-0-----------");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("-------------------Step-1-----------");	
		
		driver.manage().window().maximize();
		System.out.println("-------------------Step-2-----------");	
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("-------------------Step-3-----------");	
		Thread.sleep(2000);
		
		// scrolling
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		// user scrolling upto bottom
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("-------------------Step-5-----------");	
				
	
//		js.executeScript("window.scrollBy(0,100)");
//		System.out.println("-------------------Step-4-----------");	
//		Thread.sleep(2000);	

		
		// scrolling upto element
		WebElement switchbutton = driver.findElement(By.xpath("//legend[text()='Switch To Alert Example']"));
		js.executeScript("arguments[0].scrollIntoView()", switchbutton);
		
		Thread.sleep(5000);
		driver.close();
		System.out.println("-------------------Step-6-----------");	
	}

	public static void main(String[] args) throws InterruptedException {
		
			scroll();
	}

}
