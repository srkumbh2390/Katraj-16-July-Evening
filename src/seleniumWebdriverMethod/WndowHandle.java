package seleniumWebdriverMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WndowHandle {
	
	static String path="D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";

	public static void windowHandling() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", path);
		System.out.println("-------------------Step-0-----------");
		
		WebDriver driver= new ChromeDriver();
		System.out.println("-------------------Step-1-----------");
		
		driver.manage().window().maximize();
		System.out.println("-------------------Step-2-----------");
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("-------------------Step-3-----------");
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;	
		
		WebElement Tab = driver.findElement(By.id("opentab"));
		
		js.executeScript("arguments[0].scrollIntoView()", Tab);
		System.out.println("-------------------Step-4-----------");

		String parentTab = driver.getWindowHandle();
		System.out.println("Parent Tab : " + parentTab);
		System.out.println("-------------------Step-5-----------");
		
		Tab.click();
		System.out.println("-------------------Step-6-----------");
		
		//using getWindowHandles
		Set<String> Tabs = driver.getWindowHandles();
		
		//number of tabs
		System.out.println(Tabs.size());
		System.out.println("-------------------Step-7-----------");
		
		//iterating the value
		for (String val : Tabs) {
			
			if (!val.equals(parentTab)) {
				
				//switch to Tab
				driver.switchTo().window(val);
				String childTitle = driver.getTitle();
				System.out.println("child tab Title : "+ childTitle);				
			}
			
		}
		System.out.println("-------------------Step-8-----------");
		
		//switch back to parent tab
		driver.switchTo().window(parentTab);
		String ParentTitle = driver.getTitle();
		System.out.println("parent tab Title : " + ParentTitle);		
		System.out.println("-------------------Step-9-----------");
		
		Thread.sleep(6000);
		driver.quit();
		System.out.println("-----------Step-10---------");
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		windowHandling();
			
	}

}
