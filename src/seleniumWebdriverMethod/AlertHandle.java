package seleniumWebdriverMethod;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {
	
	static String path = "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";
	
	public static void AlertHandling() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", path);
		System.out.println("-------------------Step-0-----------");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("-------------------Step-1-----------");	
		
		driver.manage().window().maximize();
		System.out.println("-------------------Step-2-----------");	
		
		driver.get("https://www.flipkart.com");
		System.out.println("-------------------Step-3-----------");	
		Thread.sleep(2000);
		
		WebElement alertTab = driver.findElement(By.id("alertbtn"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("argumens[0].scrollIntoView()", alertTab);
		
		alertTab.click();
		
		Alert alert = driver.switchTo().alert();
		
		String alertText = alert.getText();
		System.out.println(alertText);
		
		alert.accept();	
	}	

	public static void main(String[] args) throws InterruptedException {
		
		AlertHandling();
	}
}
