package selen2practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	
	String path ="D:\\\\test\\\\Selenium\\\\Driver\\\\All Driver\\\\chromedriver.exe";
	
	public void DoubleClicking() throws InterruptedException {
		//set path require for creating driver instance
		System.setProperty("webdriver.chrome.driver", path);
		
		//step-1  crating object of chrome diver
		WebDriver driver = new ChromeDriver();
		System.out.println("-----------Step-1---------");
		
		//step-2 maximize
		driver.manage().window().maximize();
		System.out.println("-----------Step-2---------");
		
		//step-3  open webpage
		driver.get("https://demoqa.com/buttons");
		System.out.println("-----------Step-3---------");
		
		//step-4 find element
		WebElement button1 = driver.findElement(By.id("doubleClickBtn"));
		System.out.println("-----------Step-4---------");
		
		// step-5 Actions class
		Actions act=new Actions(driver);
		
		act.doubleClick(button1).perform();
		System.out.println("-----------Step-5---------");
		Thread.sleep(2000);
		
		//step -6 verification
		String text = driver.findElement(By.id("doubleClickMessage")).getText();
		if (text.contains("double click")) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		System.out.println("-----------Step-6---------");
		Thread.sleep(5000);
		
		//step-7 close
		driver.close();
		System.out.println("-----------Step-7--------");
	}

	public static void main(String[] args) throws InterruptedException {
		DoubleClick var = new DoubleClick();
		var.DoubleClicking();
	}
}
