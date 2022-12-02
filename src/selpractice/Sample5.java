package selpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample5 {
	
	public static void m5() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	
		js.executeScript("arguments[0].scrollIntoView()", dropdown);
		
		Select sel= new Select(dropdown);
//		sel.selectByVisibleText("Option2");
		
//		sel.selectByIndex(1);
		
		List<WebElement> list = sel.getOptions();	
		System.out.println(list.size());
		
		for (WebElement ele : list ) {
			String text = ele.getText();
			System.out.println(text);
			
			if (text.equals("Option1")) {
				ele.click();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		m5();

	}

}
