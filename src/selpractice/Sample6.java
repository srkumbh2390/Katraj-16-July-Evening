package selpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample6 {
	
	public static void m6() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		WebElement alerttab = driver.findElement(By.xpath("//legend[text()='Switch To Alert Example']"));
				
		js.executeScript("arguments[0].scrollIntoView()", alerttab);
		
		WebElement alertbutton = driver.findElement(By.xpath("//input[@id='alertbtn']"));
		alertbutton.click();
		Thread.sleep(2000);
		
		Alert al=driver.switchTo().alert();
		String textofAlert = al.getText();
		System.out.println(textofAlert);
		Thread.sleep(2000);
		al.accept();
		Thread.sleep(2000);
		
		WebElement name = driver.findElement(By.name("enter-name"));
		name.sendKeys("Swapnil Kumbhare");
		Thread.sleep(2000);
		
		WebElement confirmbutton = driver.findElement(By.xpath("//input[@id='confirmbtn']"));
		confirmbutton.click();
		Thread.sleep(2000);
		
		String text2 = al.getText();
		System.out.println(text2);
		
		if (text2.contains("Swapnil Kumbhare")) {
			Thread.sleep(2000);
			al.accept();
			System.out.println("Accepted");
		}
		else {
			al.dismiss();
			System.out.println("Rejected");
		}
		Thread.sleep(5000);
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		m6();

	}

}
