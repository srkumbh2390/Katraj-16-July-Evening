package seleniumWebdriverMethod;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
	
	static String path1 = "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";
	
	public static void ElementFinding() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", path1);
		System.out.println("-------------------Step-0-----------");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("-------------------Step-1-----------");	
		
		driver.manage().window().maximize();
		System.out.println("-------------------Step-2-----------");	
		
		driver.get("http://www.facebook.com");
		System.out.println("-------------------Step-3-----------");	
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("srk@gmail.com");
		System.out.println("-------------------Step-4A-----------");	
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("789@abc");
		System.out.println("-------------------Step-4B-----------");	
		Thread.sleep(2000);
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		System.out.println("-------------------Step-5-----------");	
		Thread.sleep(2000);
		
		String parentTab = driver.getWindowHandle();
		System.out.println("Parent Tab : " + parentTab);
		System.out.println("-----------Step-6---------");

		WebElement continueButton = driver.findElement(By.xpath("//button[@autofocus='1']"));
		continueButton.click();
		System.out.println("-------------------Step-7-----------");	
		Thread.sleep(10000);
		
		driver.quit();
		System.out.println("-------------------Step-8-----------");	
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		ElementFinding();
	}

}
