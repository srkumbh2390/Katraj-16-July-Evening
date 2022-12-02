package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel2 {
	
	public void verifyTitle () throws InterruptedException {
	
	//set path require while creating driver instance 
	System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
	
	//step -1 create object of chrome driver
	WebDriver driver =new ChromeDriver();		
	
	//step-2 maximize
	driver.manage().window().maximize();		
	
	//step-3 open webpage
	driver.get("https://www.facebook.com");
	
	//step-4 get actual title from webpage
	String actual_Title = driver.getTitle();
	System.out.println(actual_Title);
	
	String expected_Title = "Facebook";
	
	//step-5 verification
	if(actual_Title.contains(expected_Title)) {
		System.out.println("test case passed");
	}
	else {
		System.out.println("test case failed");
	}
	//step 6
	driver.close();	
	Thread.sleep(2000);
	}
	public static void main(String[] args) throws InterruptedException  {
		
		Sel2 ref = new Sel2();
		ref.verifyTitle();
			
	}

}
