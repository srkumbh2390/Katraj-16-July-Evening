package selpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	
	public static void m2() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		WebElement option1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
//		option1.click();
		
		List<WebElement> list = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement ele : list) {
			ele.click();
			Thread.sleep(2000);
		}	
		List<WebElement> list1 = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement ele1 : list) {
			ele1.click();
			Thread.sleep(2000);
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		m2();

	}

}
