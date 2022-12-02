package selpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {

	public static void m3() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
//		WebElement radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
//		radio1.click();
		
		List<WebElement> radio = driver.findElements(By.xpath("//input[@name='radio']"));
		System.out.println("No of Element : " + radio.size());
		
		for (WebElement ele : radio) {
			ele.click();
			Thread.sleep(2000);
		}
		
		driver.close();
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		m3();
	}

}
