package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	
	String path ="D:\\\\test\\\\Selenium\\\\Driver\\\\All Driver\\\\chromedriver.exe";
	
	public void clicking2() throws InterruptedException {
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
		
		//step-4 locate button
		WebElement Button1 = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		System.out.println("-----------Step-4---------");
		
		//step-5 using actions class
		Actions Act1=new Actions(driver);
		
		Act1.doubleClick(Button1).perform();
		Thread.sleep(2000);
		System.out.println("-----------Step-5---------");
		
		 //step-6 verification
		String text1 = driver.findElement(By.id("doubleClickMessage")).getText();
		if (text1.contains("double click")) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		System.out.println("-----------Step-6---------");
		
		// step 7
		Thread.sleep(5000);
		driver.close();
		System.out.println("-----------Step-7---------");
	}

	public static void main(String[] args) throws InterruptedException {
		DoubleClick var = new DoubleClick();
		
		var.clicking2();
		
	}

}
