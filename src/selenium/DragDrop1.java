package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop1 {
	
	String path ="D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";
	
	public void Dragdroping() throws InterruptedException, IOException {
		//set path require for creating driver instance
		System.setProperty("webdriver.chrome.driver", path);
		
		//step-1  crating object of chrome diver
		WebDriver driver = new ChromeDriver();
		System.out.println("-----------Step-1---------");
		
		//step-2 maximize
		driver.manage().window().maximize();
		System.out.println("-----------Step-2---------");
		
		//step-3  open webpage
		driver.get("https://jqueryui.com/droppable");
		System.out.println("-----------Step-3---------");
		Thread.sleep(3000);
		
		// step-4 switch to frame
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		System.out.println("-----------Step-4---------");
		
		//step-5 verification
		String dragtext = driver.findElement(By.xpath("//p[text()='Drag me to my target']")).getText();
				{	if (dragtext.contains("Drag")) {
					System.out.println("Drag Test case Passed");
				}
				else {
					System.out.println("Drag Test Case Failed");
				}
				}
		String droptext = driver.findElement(By.xpath("//p[text()='Drop here']")).getText();
				{	if (droptext.contains("Drop")) {
					System.out.println("Drop Test Case Passed");
				}
				else {
					System.out.println("Drop Test Case Failed");
				}
				}
				System.out.println("-----------Step-5---------");
		
		//step -6 Actions class & find element drag and drop
		Actions Act=new Actions(driver);		
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		System.out.println("-----------Step-6---------");
		
		// step-7-drag and drop
		Act.dragAndDrop(drag, drop).perform();
		System.out.println("-----------Step-7---------");
		Thread.sleep(3000);	
		
		//step -8 screenshot
		Screenshot.screenshotcap(driver, droptext);
		System.out.println("-----------Step-8---------");		
		
		
		//step-9 close
		Thread.sleep(5000);
		driver.close();
		System.out.println("-----------Step-9---------");		
		
	}

	public static void main(String[] args) throws InterruptedException, IOException {
	
			DragDrop1 ref =new DragDrop1();
			ref.Dragdroping();
	}

}
