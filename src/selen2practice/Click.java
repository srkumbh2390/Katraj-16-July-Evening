package selen2practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {
	
	String path ="D:\\\\test\\\\Selenium\\\\Driver\\\\All Driver\\\\chromedriver.exe";
	
	public void clicking() throws InterruptedException {
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
		WebElement button3 = driver.findElement(By.xpath("//button[text()='Click Me']"));
		button3.click();
		System.out.println("-----------Step-4---------");
		
		//step-5 verification
		String text = driver.findElement(By.id("dynamicClickMessage")).getText();
		if (text.contains("dynamic click")) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		System.out.println("-----------Step-5---------");
		Thread.sleep(5000);
		
		//step-6 close
		driver.close();
		System.out.println("-----------Step-6---------");
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		Click ref=new Click();
		ref.clicking();
		
	}

}
