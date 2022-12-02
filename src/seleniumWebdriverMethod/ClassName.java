package seleniumWebdriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {
	
	static String path = "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";
	
	public static void Locating() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", path);
	System.out.println("-------------------Step-0-----------");
	
	WebDriver driver = new ChromeDriver();
	System.out.println("-------------------Step-1-----------");	
	
	driver.manage().window().maximize();
	System.out.println("-------------------Step-2-----------");	
	
	driver.get("https://www.tutorialspoint.com/videotutorials/subscription.php");
	System.out.println("-------------------Step-3-----------");	
	Thread.sleep(2000);
	
	WebElement n = driver.findElement(By.className("input"));						// className
    n.sendKeys("JavaScript");
    
    driver.findElement(By.id("btnSearch")).click();
	}
	public static void main(String[] args) throws InterruptedException {
		
		Locating();
		
	}

}
