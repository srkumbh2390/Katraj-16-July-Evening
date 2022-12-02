package selpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sam1 {
	
	public static void m1() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
//		WebElement username = driver.findElement(By.name("email"));
//		username.sendKeys("srk23@gmail.com");
//		
//		WebElement password = driver.findElement(By.name("pass"));
//		password.sendKeys("srk@2312");
		
//		String title = driver.getTitle();
//		System.out.println(title);	
//		
//		String title_compare = "Facebook – log in or sign up";
//		
//		if(title.equals("title_compare")) {
//			System.out.println("Test case Passed");
//		}
//		else {
//			System.out.println("Test case Failed");
//		}
//		
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
		
		
		WebElement button = driver.findElement(By.linkText("Create New Account"));		
		button.click();
//		WebElement password = driver.findElement(By.partialLinkText("password"));
//		password.click();
		
//		driver.findElement(By.name("email")).sendKeys("srk12@gmail.com");
//		driver.findElement(By.name("pass")).sendKeys("swap@123");
		
//		WebElement buttonlogin = driver.findElement(By.name("login"));
//		buttonlogin.click();
//		
//		WebElement buttonYes = driver.findElement(By.xpath("//button[@autofocus='1']"));
//		buttonYes.click();			
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		m1();

	}

}
