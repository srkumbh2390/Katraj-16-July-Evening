package selpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sam3 {
	
	public static void m3() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement option1 = driver.findElement(By.xpath("//input[@name='checkBoxOption1']"));
		js.executeScript("arguments[0].scrollIntoView()", option1);		
		
		List<WebElement> list = driver.findElements(By.xpath("//input[@type='checkbox']"));			
		for (WebElement ele : list) {
			Thread.sleep(1000);
			ele.click();			
		}
//		WebElement radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
//		radio1.click();
		
		List<WebElement> radiolist = driver.findElements(By.xpath("//input[@name='radio']"));
		for (WebElement ele : radiolist) {
			Thread.sleep(1000);
			ele.click();
		}
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@name='dropdown-class-example']"));
		js.executeScript("arguments[0].scrollIntoView()", dropDown);
		
		Select sel=new Select(dropDown);
		sel.selectByIndex(0);
//		sel.selectByVisibleText("Option2");
		
//		List<WebElement> list1 = sel.getOptions();
//		System.out.println(list1.size());
//		
//		for (WebElement ele2 : list1) {
//			String text = ele2.getText();
//			System.out.println(text);
//			if (text.equals("Option1"));
//			ele2.click();
//		}
		
		
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		
		m3();
	}

}
