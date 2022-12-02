package accessmodifier;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
	
				// set the properties
				System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://www.makemytrip.com/bus-tickets/");
				
				String actTitle = driver.getTitle();
				System.out.println(actTitle);
				
				driver.findElement(By.xpath("//p[text()='Login or Create Account']")).click();			
				Thread.sleep(2000);	
				
				driver.findElement(By.id("username")).sendKeys("1234567897");
				Thread.sleep(2000);				
				
				WebElement continueButton = driver.findElement(By.xpath("//iframe[@id='gsi_426933_522356']"));
				continueButton.click();
				
				
//				if (continueButton.isEnabled()) {
//					continueButton.click();
//				}
//								
				
				

				
				
//				Thread.sleep(5000);				
//				driver.close();
			}

		}