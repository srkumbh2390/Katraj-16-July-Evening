package seleniumWebdriverMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	
	static String path1 = "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";
	
	public static void ElementsFinding() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", path1);
		System.out.println("-------------------Step-0-----------");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("-------------------Step-1-----------");	
		
		driver.manage().window().maximize();
		System.out.println("-------------------Step-2-----------");	
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("-------------------Step-3-----------");	
		Thread.sleep(2000);
		
		JavascriptExecutor jss= (JavascriptExecutor)driver;
		WebElement OptionBox1 = driver.findElement(By.id("checkBoxOption1"));		
		jss.executeScript("arguments[0].scrollIntoView()",OptionBox1);
		System.out.println("-------------------Step-4-----------");	
		
		List<WebElement> list = driver.findElements(By.xpath("//input[@type='checkbox']"));		
		System.out.println("Number of Elements : " + list.size());
		System.out.println("-------------------Step-5-----------");	
		
		for (WebElement ele : list) {
			
			ele.click();
			Thread.sleep(2000);			
		}
		System.out.println("-------------------Step-6-----------");	
		
		Thread.sleep(8000);		
		driver.quit();
		System.out.println("-------------------Step-7-----------");	
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		ElementsFinding();

	}

}
