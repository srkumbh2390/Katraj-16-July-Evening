package selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Action1 {
	
	public void actionClassOperation() throws InterruptedException {
				//set path require for creating driver instance
				System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");
				
				//step-1  crating object of chrome diver
				WebDriver driver = new ChromeDriver();
				
				//step-2 maximize
				driver.manage().window().maximize();
				
				//step-3  open webpage
				driver.get("https://vctcpune.com/selenium/practice.html");
				
				//step-4 scrolling
				JavascriptExecutor js = (JavascriptExecutor)driver;
				
				js.executeScript("window.scrollBy(0, 700)","");
				Thread.sleep(2000);
				
				//step-5 get an element 
				WebElement DropdownElement = driver.findElement(By.id("dropdown-class-example"));
				DropdownElement.click();
				Thread.sleep(2000);
				
				//step-6 using actions class
				Actions act=new Actions(driver);
				
				//step-7-moving downward
				act.sendKeys(Keys.ARROW_DOWN).perform();
				
				act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
				
				act.sendKeys(Keys.ARROW_UP).perform();
				}			

	public static void main(String[] args) throws InterruptedException {
		Action1 ref=new Action1();
		ref.actionClassOperation();
	}

}
