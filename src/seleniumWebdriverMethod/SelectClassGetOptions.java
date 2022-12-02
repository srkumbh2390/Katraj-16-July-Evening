package seleniumWebdriverMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassGetOptions {
	
	static String path1 = "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";
	
	public static void Selecting() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", path1);
		System.out.println("-------------------Step-0-----------");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("-------------------Step-1-----------");	
		
		driver.manage().window().maximize();
		System.out.println("-------------------Step-2-----------");	
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		System.out.println("-------------------Step-3-----------");	
		Thread.sleep(2000);
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='first']"));			
		System.out.println("-------------------Step-4-----------");	
		
		//step-4  using select class for handling dropdown
		Select sel=new Select(dropdown);	
	
		//get all values of dropdown
		List<WebElement> dropdownlist = sel.getOptions();						//select.getOptions()
		
		//get no of values from list
		System.out.println(dropdownlist.size());
		System.out.println("-------------------Step-5-----------");	
		
		//iterating on group of values
		
		for (WebElement ele : dropdownlist) {
			
			String text = ele.getText();			
			System.out.print(text+",");
			if (text.equals("Iphone")) {
				ele.click();				
				
			}			
		}
		System.out.println();
		Thread.sleep(2000);	
		System.out.println("-------------------Step-6-----------");	
		
		
		WebElement Animaldropdown = driver.findElement(By.id("animals"));
		
		Select sel1=new Select(Animaldropdown);
		
		List<WebElement> animaldropdownlist = sel1.getOptions();
		
		System.out.println(animaldropdownlist.size());
		
		for (WebElement ele1 : animaldropdownlist) {
			
			String text1 = ele1.getText();
			System.out.print(text1 + ",");
			if (text1.equals("Avatar")) {
				
				ele1.click();
			}
		}
		System.out.println();
		
		Thread.sleep(5000);		
		driver.close();
		System.out.println("-------------------Step-7-----------");	
	}

	public static void main(String[] args) throws InterruptedException {
		
				Selecting();

	}

}
