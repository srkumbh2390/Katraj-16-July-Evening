package selpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	
	public static void f1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");
		//step-1 initalize instance-
		WebDriver driver = new ChromeDriver();
		
		//step-2 maximize
		driver.manage().window().maximize();
		
		//step-3  open webpage
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("srk@gmail.com");
//		
//		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("abc123");
//		
//		WebElement submitbutton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
//		submitbutton.click();
		
		WebElement newAcc = driver.findElement(By.xpath("//a[@class='_14Me7y']"));
		newAcc.click();
		
//		WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
//		login.click();
//		
//		WebElement signup = driver.findElement(By.xpath("//div[@class='_3wJI0x']"));
//		signup.click();
		
		WebElement mobile = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		mobile.sendKeys("8600594469");
		
		WebElement buttoncontinue = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		buttoncontinue.click();
	}

	public static void main(String[] args) throws InterruptedException {
		f1();

	}

}
