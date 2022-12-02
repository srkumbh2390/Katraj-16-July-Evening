package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel4 {
	
	public void verifyTitle() throws InterruptedException {
		//set path require while creating driver instance 
				System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
				
				//step -1 create object of chrome driver
				WebDriver driver =new ChromeDriver();		
				
				//step-2 maximize
				driver.manage().window().maximize();		
				 
				//step-3 open webpage
				driver.get("https://vctcpune.com/selenium/practice.html");
				
				//step-4 find element
				WebElement checkBox1 = driver.findElement(By.name("checkBoxOption1"));
				checkBox1.click();
				
				Thread.sleep(8000);
				//step-5
				driver.close();

	}

	public static void main(String[] args) throws InterruptedException {
			Sel4 ref = new Sel4();
			ref.verifyTitle();
	}

}
