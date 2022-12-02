package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	
	String path ="D:\\\\test\\\\Selenium\\\\Driver\\\\All Driver\\\\chromedriver.exe";
	
	public void SliderHandling() throws InterruptedException {
				//set path require for creating driver instance
				System.setProperty("webdriver.chrome.driver", path);
				
				//step-1  crating object of chrome diver
				WebDriver driver = new ChromeDriver();
				System.out.println("-----------Step-1---------");
				
				//step-2 maximize
				driver.manage().window().maximize();
				System.out.println("-----------Step-2---------");
				
				//step-3  open webpage
				driver.get("https://jqueryui.com/slider");
				System.out.println("-----------Step-3---------");
				
				//step-4 switch to frame
				WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
				driver.switchTo().frame(frame);
				System.out.println("-----------Step-4---------");
				
				//step-5 find slider element 
				WebElement slider = driver.findElement(By.id("slider"));
				System.out.println("-----------Step-5---------");
				
				//step-6 using actions for performing actions on slider
				Actions Act1 =new Actions(driver);
				
				//click & hold the slider
				Act1.clickAndHold(slider).perform();
				Thread.sleep(2000);
				
				//move the slider
				Act1.moveByOffset(600, 0).perform();
				Thread.sleep(2000);
				
				//release slider
				Act1.release(slider).perform();
				System.out.println("-----------Step-6---------");
				Thread.sleep(8000);
				
				// close browser
				driver.close();
				System.out.println("-----------Step-7---------");
	}

	public static void main(String[] args) throws InterruptedException {
		Slider ref=new Slider();
		
		ref.SliderHandling();

	}

}
