package seleniumWebdriverMethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragObjectAndScreeShot {
	
	static String path1 = "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";
	
	public static void ObjectDragging() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", path1);
		System.out.println("-------------------Step-0-----------");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("-------------------Step-1-----------");	
		
		driver.manage().window().maximize();
		System.out.println("-------------------Step-2-----------");	
		
		driver.get("https://jqueryui.com/draggable");
		System.out.println("-------------------Step-3-----------");	
		Thread.sleep(2000);		

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		System.out.println("-------------------Step-4-----------");	
		

		WebElement drag = driver.findElement(By.id("draggable"));
		System.out.println("-------------------Step-5-----------");	
		Thread.sleep(3000);	
		
		Actions act=new Actions(driver);
		System.out.println("-------------------Step-6-----------");	
		Thread.sleep(3000);	
		
		
		act.dragAndDropBy(drag, 150, 50).perform();
		System.out.println("-------------------Step-7-----------");	
		Thread.sleep(4000);	
		
		ScreenShot.ScreenCap(driver, "Swap");
		System.out.println("-------------------Step-8-----------");	
		Thread.sleep(2000);	
		
		driver.close();
		System.out.println("-------------------Step-9-----------");	
	}

	public static void main(String[] args) throws InterruptedException, IOException {		

		ObjectDragging();
			
	}

}
