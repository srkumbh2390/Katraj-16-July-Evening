package selpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void m1() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
//		driver.navigate().to("https://www.rediffmail.com");
//		Thread.sleep(1000);
//		
//		driver.navigate().back();
//		
//		driver.navigate().forward();
//		
//		driver.navigate().back();
		   
		  String title = driver.getTitle();
		  System.out.println(title);
		  
		  String title_compare="Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		  
		  if (title.equals(title_compare)) {
			  System.out.println("Tast Case Passed");
		  }
		  else {
			  System.out.println("Test Case Failed");
		  }
		    String url = driver.getCurrentUrl();
		    System.out.println(url);
		    
//		    WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
//		    username.sendKeys("srk@gmail.com");
//		    
//		   WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
//		   password.sendKeys("abc123");
//		   
//		   WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
//		   button.click();
		    
		    WebElement username = driver.findElement(By.id("email"));
		    username.sendKeys("srk@gmail.com");
		    Thread.sleep(1000);
		    
		   WebElement password = driver.findElement(By.name("pass"));
		   password.sendKeys("abc123");
		   Thread.sleep(1000);
		   
		   WebElement button = driver.findElement(By.name("login"));
		   button.click();
		   
		   driver.close();
		  
		   
		
		   
		   
	}  	   
	
	public static void main(String[] args) throws InterruptedException {
	m1();
		

	}

}
