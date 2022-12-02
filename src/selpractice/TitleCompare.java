package selpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleCompare {
	
	public static void compare() {
		System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String Actual_Title = driver.getTitle();
		System.out.println(Actual_Title);		
		
		String Expected_Title= "Facebook";
		
		if (Actual_Title.contains(Expected_Title)) {
			System.out.println("Test cases Passed");
		}
		else {
			System.out.println("Test cases Failed");
		}
		
	}

	public static void main(String[] args) {
		compare();
	}

}
