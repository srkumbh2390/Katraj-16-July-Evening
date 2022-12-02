package seleniumWebdriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	
	static String path = "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";
	
	public static void Acting() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", path);
		System.out.println("-------------------Step-0-----------");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("-------------------Step-1-----------");	
		
		driver.manage().window().maximize();
		System.out.println("-------------------Step-2-----------");	
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("-------------------Step-3-----------");	
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		js.executeScript("arguments[0].scrollIntoView()", dropdown);
		dropdown.click();
		
		Actions Act= new Actions(driver);		
		
		Act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		
		Act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		
		Act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		
	}

	public static void main(String[] args) throws InterruptedException {
		
			Acting();
	}

}
