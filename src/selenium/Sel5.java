package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel5 {
	
	public void test() throws InterruptedException  {
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		//step -1 create object of chrome driver
		WebDriver driver =new ChromeDriver();		
		
		//step-2 maximize
		driver.manage().window().maximize();		
		 
		//step-3 open webpage
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//step-4 find elements
		List <WebElement > list = driver.findElements(By.xpath("//input[@name='radio']"));
		
		System.out.println("No of element " + list.size());
		
for ( WebElement ele : list) {
			
			ele.click();
			Thread.sleep(1000);
		}
		
		Thread.sleep(8000);
		//step-6
		driver.close();

	}

	public static void main(String[] args) throws InterruptedException {
	
		Sel5 ref = new Sel5();
		ref.test();
	}

}
