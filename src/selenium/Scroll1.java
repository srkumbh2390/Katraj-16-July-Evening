package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll1 {
	
	public void test() throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
	
	//step -1 create object of chrome driver
	WebDriver driver =new ChromeDriver();		
	
	//step-2 maximize
	driver.manage().window().maximize();		
	 
	//step-3 open webpage
	driver.get("https://vctcpune.com/selenium/practice.html");
	Thread.sleep(5000);
	
	//stp-3 a scrolling on webpage
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("window.scrollBy(0,700)", "");
			Thread.sleep(2000);
			
			
			//going back to initial position
			js.executeScript("window.scrollBy(0,-700)", "");
			Thread.sleep(2000);
			
			//scrolling to bottom of page
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
			Thread.sleep(2000);
			
			
			//scrolling in element context
			WebElement tab = driver.findElement(By.id("opentab"));
			js.executeScript("arguments[0].scrollIntoView();", tab);
			
			Thread.sleep(8000);
			//step-6
			driver.close();



	}
	public static void main(String[] args) throws InterruptedException {
		
		Scroll1 var = new Scroll1();
		var.test();
	}

}
