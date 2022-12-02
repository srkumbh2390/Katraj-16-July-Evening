package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {
	
	String path ="D:\\\\test\\\\Selenium\\\\Driver\\\\All Driver\\\\chromedriver.exe";
	
	public void clicking() throws InterruptedException {
		//set path require for creating driver instance
		System.setProperty("webdriver.chrome.driver", path);
		
		//step-1  crating object of chrome diver
		WebDriver driver = new ChromeDriver();
		System.out.println("-----------Step-1---------");
		
		//step-2 maximize
		driver.manage().window().maximize();
		System.out.println("-----------Step-2---------");
		
		//step-3  open webpage
		driver.get("https://demoqa.com/buttons");
		System.out.println("-----------Step-3---------");
		
		//step-4  find element
		WebElement Button3 = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]"));	
		Button3.click();
		System.out.println("-----------Step-4---------");		

		
		//step-5 Verification
		String text = driver.findElement(By.id("dynamicClickMessage")).getText();
		if (text.contains("dynamic click")) {			
			System.out.println("Test case Passed");
		}
		else {
			System.out.println("Test case Failed");
		}
		System.out.println("-----------Step-5---------");
		
		//step -6 close window
		Thread.sleep(5000);
		driver.close();
		System.out.println("-----------Step-6---------");
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		Click ref=new Click();
		ref.clicking();
	}

}
