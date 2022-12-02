package seleniumWebdriverMethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropAndScreenShot {
	
	static String path = "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";
	
	public static void DragandDropping() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", path);
		System.out.println("-------------------Step-0-----------");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("-------------------Step-1-----------");	
		
		driver.manage().window().maximize();
		System.out.println("-------------------Step-2-----------");	
		
		driver.get("https://jqueryui.com/droppable");
		System.out.println("-------------------Step-3-----------");	
		Thread.sleep(2000);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		System.out.println("-------------------Step-4-----------");	
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		System.out.println("-------------------Step-5-----------");	
		
		Actions Act=new Actions(driver);		
		
		Act.dragAndDrop(drag, drop).perform();
		System.out.println("-------------------Step-6-----------");						//	dragAndDrop  Actions perform
		Thread.sleep(3000);
		
		
		ScreenShots.screenCapture(driver);												// ScreenShot Captured
		Thread.sleep(3000);		
		System.out.println("-------------------Step-7-----------");
		
		
		driver.close();	
		System.out.println("-------------------Step-8-----------");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		DragandDropping();
	}

}
