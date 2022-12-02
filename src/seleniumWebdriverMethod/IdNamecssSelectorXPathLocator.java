package seleniumWebdriverMethod;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class IdNamecssSelectorXPathLocator {
	
	static String path1 = "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";
	
	public static void IdNameTagClassLocating() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", path1);
		System.out.println("-------------------Step-0-----------");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("-------------------Step-1-----------");	
		
		driver.manage().window().maximize();
		System.out.println("-------------------Step-2-----------");	
		
		driver.get("https://careerwise.minnstate.edu/jobs/practice-online-job-application.html");
		System.out.println("-------------------Step-3-----------");	
		Thread.sleep(2000);
		
		driver.findElement(By.id("start-button")).click();															// id
		
		driver.findElement(By.id("fname")).sendKeys("Swapnil");														// id
		Thread.sleep(1000);
		
		driver.findElement(By.name("lname")).sendKeys("Kumbhare");													// name
		Thread.sleep(1000);
		
		driver.findElement(By.name("email")).sendKeys("srkumbhare@rediffmail.com");									// name
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input#address")).sendKeys("Near Anand Buddha Vihar");					// 1. tagname#id  cssSelector
		
		driver.findElement(By.id("address2")).sendKeys("Waifad");													// id
																		
		driver.findElement(By.xpath("//input[@type='text' and @name='city']")).sendKeys("Wardha");	 				//1. Xpath with AND
		
		driver.findElement(By.xpath("(//input[@id='zip' or @name='zip'])[1]")).sendKeys("44201");    				// 2. xpath with or
		
		driver.findElement(By.id("phone")).sendKeys("860-059-4469");
								
		driver.findElement(By.cssSelector("button.image-submit")).click();											//2. tagName.className   cssSelector
		
		driver.findElement(By.xpath("//input[@maxlength='40' and @id='yes_prev_app']")).sendKeys("Not applied");	//1. Xpath with AND
		
		driver.findElement(By.xpath("//textarea[@id='position']")).sendKeys("Software Test Engineer");				//- 3. tagName[attribute='value']----cssSelector- 
	
		Thread.sleep(5000);
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		
		IdNameTagClassLocating();
	}

}
