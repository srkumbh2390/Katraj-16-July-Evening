package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandleClass {
	
	String path ="D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";
	
	public void windowHandling() throws InterruptedException {
		//set path require for creating driver instance
				System.setProperty("webdriver.chrome.driver", path);
				
				//step-1  crating object of chrome diver
				WebDriver driver = new ChromeDriver();
				System.out.println("-----------Step-1---------");
				
				//step-2 maximize
				driver.manage().window().maximize();
				System.out.println("-----------Step-2---------");
				
				//step-3  open webpage
				driver.get("https://vctcpune.com/selenium/practice.html");
				System.out.println("-----------Step-3---------");
				Thread.sleep(3000);
				
				//step 4 - scrolling
				JavascriptExecutor js=(JavascriptExecutor)driver;
				
				WebElement Buttontab = driver.findElement(By.id("opentab"));
				js.executeScript("arguments[0].scrollIntoView();", Buttontab);
				System.out.println("-----------Step-4---------");
				
				//step-5--current window handle
				String parenttab = driver.getWindowHandle();
				System.out.println("Parend tab : " + parenttab);
				System.out.println("-----------Step-5---------");
				
				//step-6--tab locator
				Buttontab.click();
				System.out.println("-----------Step-6---------");
				Thread.sleep(3000);
				
				//step-7  using getWindow Handles
				Set<String> tabs = driver.getWindowHandles();
				
				//no of tabs
				System.out.println(tabs.size());
				
				//iterating on value
				for(String val :tabs) {
					if(!val.equals(parenttab)) {
						
						//switch to tab
						driver.switchTo().window(val);
						String childTabTitle = driver.getTitle();	
						System.out.println("Child Tab Title : " + childTabTitle);
						Thread.sleep(2000);
					}
				}
				System.out.println("-----------Step-7---------");
				
				//step-8
				//switch back to parent tab
				driver.switchTo().window(parenttab);
				String ParentTabTitle = driver.getTitle();
				System.out.println("Parent Tab Title : " + ParentTabTitle);
				System.out.println("-----------Step-8---------");
				
				//step--9
				Thread.sleep(5000);
				driver.quit();
				System.out.println("-----------Step-9---------");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WindowHandleClass ref= new WindowHandleClass();
		ref.windowHandling();
	}

}
