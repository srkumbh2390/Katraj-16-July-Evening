package seleniumWebdriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlierHandle {
	
	static String path1 = "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";
	
	public static void slideHandling() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", path1);
		System.out.println("-------------------Step-0-----------");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("-------------------Step-1-----------");	
		
		driver.manage().window().maximize();
		System.out.println("-------------------Step-2-----------");	
		
		driver.get("https://jqueryui.com/slider");
		System.out.println("-------------------Step-3-----------");	
		Thread.sleep(2000);	
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		System.out.println("-------------------Step-4-----------");	
		Thread.sleep(2000);	
		
		WebElement slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		System.out.println("-------------------Step-5-----------");			
		
		Actions act=new Actions(driver);
		
		//click and hold slider
		act.clickAndHold(slider).perform();
		System.out.println("-------------------Step-6-----------");	
		Thread.sleep(2000);	
		
		//move the slider
		act.moveByOffset(300, 0).perform();
		System.out.println("-------------------Step-7-----------");	
		Thread.sleep(2000);	
		
		//release slider
		act.release(slider).perform();
		System.out.println("-------------------Step-8-----------");	
		Thread.sleep(2000);	
		
		// close browser
		driver.close();
		System.out.println("-------------------Step-9-----------");	
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		slideHandling();
	}

}
