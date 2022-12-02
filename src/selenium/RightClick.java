package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
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
				
				//step-4 locate button
				WebElement Button2 = driver.findElement(By.id("rightClickBtn"));
				System.out.println("-----------Step-4---------");
				
				//step-5 using actions class
				Actions act=new Actions(driver);
				
				act.contextClick(Button2).perform();
				Thread.sleep(2000);
				System.out.println("-----------Step-5---------");
				
				 //step-6 verification
				String text = driver.findElement(By.id("rightClickMessage")).getText();
				
				if (text.contains("right click")) {
					System.out.println("Test case Passed");
				}
				else {
					System.out.println("Test Case Failed");
				}
				System.out.println("-----------Step-6---------");
				
				//step-7
				Thread.sleep(8000);
				driver.close();
				System.out.println("-----------Step-7---------");
				
	}

	public static void main(String[] args) throws InterruptedException {
		
		RightClick ref = new RightClick();
		ref.clicking();
		

	}

}
