package seleniumWebdriverMethod;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementSendKeysClick {
	
	static String path = "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";
	
	public static void ElementKeysClicking() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", path);
		System.out.println("-------------------Step-0-----------");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("-------------------Step-1-----------");	
		
		driver.manage().window().maximize();
		System.out.println("-------------------Step-2-----------");	
		
		driver.get("https://www.flipkart.com");
		System.out.println("-------------------Step-3-----------");	
		Thread.sleep(2000);
		
		WebElement username1 = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		username1.sendKeys("abc@gmail.com");
		System.out.println("-------------------Step-4-----------");	
		Thread.sleep(2000);		
		
		WebElement password1 = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		password1.sendKeys("123@xyz");
		System.out.println("-------------------Step-5-----------");	
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		System.out.println("-------------------Step-6-----------");	
		Thread.sleep(5000);	
		
		driver.close();
		System.out.println("-------------------Step-7-----------");		
	}

	public static void main(String[] args) throws InterruptedException {
		
		ElementKeysClicking();
	}

}
