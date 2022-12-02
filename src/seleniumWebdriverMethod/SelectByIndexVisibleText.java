package seleniumWebdriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexVisibleText {
	
	static String path1 = "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";
	
	public static void Selecting() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", path1);
		System.out.println("-------------------Step-0-----------");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("-------------------Step-1-----------");	
		
		driver.manage().window().maximize();
		System.out.println("-------------------Step-2-----------");	
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("-------------------Step-3-----------");	
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		js.executeScript("arguments[0].scrollIntoView()", dropdown);
		
		//step-  using select class for handling dropdown
		Select sel=new Select(dropdown);
		
		
//		sel.selectByIndex(2);													//selecting value base on index
		
		
		sel.selectByVisibleText("Option3");										//Selection by visiable text
		
	}

	public static void main(String[] args) throws InterruptedException {
	
			Selecting();
	}

}
