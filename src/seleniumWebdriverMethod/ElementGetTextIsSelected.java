package seleniumWebdriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementGetTextIsSelected {
	
	static String path1 = "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";
	
	public static void ElementTextGetting() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", path1);
		System.out.println("-------------------Step-0-----------");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("-------------------Step-1-----------");	
		
		driver.manage().window().maximize();
		System.out.println("-------------------Step-2-----------");	
		
		driver.get("http://www.facebook.com");
		System.out.println("-------------------Step-3-----------");	
		Thread.sleep(2000);
		
		WebElement Login = driver.findElement(By.name("login"));
		String text = Login.getText();
		System.out.println("Text content is : " + text);
		System.out.println("-------------------Step-4-----------");	
		Thread.sleep(2000);
		
		driver.navigate().to("https://vctcpune.com/selenium/practice.html");
		System.out.println("-------------------Step-5-----------");	
		Thread.sleep(2000);
		
		JavascriptExecutor jss =(JavascriptExecutor)driver;
		WebElement Option1 = driver.findElement(By.id("checkBoxOption1"));
		
		jss.executeScript("arguments[0].scrollIntoView()",Option1);
		System.out.println("-------------------Step-6-----------");	
		
		Option1.click();
		System.out.println("-------------------Step-7-----------");	
		Thread.sleep(2000);
		
		boolean SelectedStatus = Option1.isSelected();
		System.out.println(SelectedStatus);
		System.out.println("-------------------Step-8-----------");	
		
		WebElement text1 = driver.findElement(By.xpath("//legend[text()='Checkbox Example']"));
		String EleText = text1.getText();
		System.out.println(EleText);
		System.out.println("-------------------Step-9-----------");	
		
		Thread.sleep(5000);
		driver.quit();
		System.out.println("-------------------Step-10-----------");	
	}

	public static void main(String[] args) throws InterruptedException {
		
		ElementTextGetting();	}

}
