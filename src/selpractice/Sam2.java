package selpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sam2 {
	
	public static void facebook () throws InterruptedException {		
	
			System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");
					
					WebDriver driver = new ChromeDriver();
					
					driver.manage().window().maximize();
					
					driver.get("https://www.facebook.com/");
					Thread.sleep(1000);	
					
					WebElement newAcc = driver.findElement(By.linkText("Create New Account"));
					newAcc.click();
					
					WebElement Fname = driver.findElement(By.name("firstname"));
					Fname.sendKeys("Swapnil");
					
					WebElement Lname = driver.findElement(By.name("lastname"));
					Lname.sendKeys("Kumbhare");
	}
	public static void main(String[] args) throws InterruptedException {
	
		facebook();
	}

}
