package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragObject {
	String path ="D:\\\\test\\\\Selenium\\\\Driver\\\\All Driver\\\\chromedriver.exe";
	public void dragging() throws InterruptedException {
		//set path require for creating driver instance
		System.setProperty("webdriver.chrome.driver", path);
		
		//step-1  crating object of chrome diver
		WebDriver driver = new ChromeDriver();
		System.out.println("-----------Step-1---------");
		
		//step-2 maximize
		driver.manage().window().maximize();
		System.out.println("-----------Step-2---------");
		
		//step-3  open webpage
		driver.get("https://jqueryui.com/draggable");
		System.out.println("-----------Step-3---------");
		
		//step-4 handle frame
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		System.out.println("-----------Step-4---------");
		
		//step-5 find drag object
		WebElement drag = driver.findElement(By.id("draggable"));
		System.out.println("-----------Step-5---------");
		Thread.sleep(2000);
		
		//step-6 actions class
		Actions Act2= new Actions(driver);
		Act2.dragAndDropBy(drag, 150, 40).perform();
		System.out.println("-----------Step-6---------");
		Thread.sleep(8000);
		
		//step-7 close window
		driver.close();
		System.out.println("-----------Step-7---------");
		
		
	}

	public static void main(String[] args) throws InterruptedException {
	DragObject var=new DragObject();
	var.dragging();
	
	}

}
