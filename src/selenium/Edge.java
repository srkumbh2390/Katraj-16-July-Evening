package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
	
	public static void edgeDriver() {
		//set path require for creating driver instance
		System.setProperty("webdriver.edge.driver", "D:\\test\\Selenium\\Driver\\All Driver\\msedgedriver.exe");
		
		//step-1 creating object of edge driver
		WebDriver driver =new EdgeDriver();
		
		//step-2 maximize
		driver.manage().window().maximize();
		
		//step-3 open webpage
		driver.get("http://www.facebook.com");
	}

	public static void main(String[] args) {
		Edge.edgeDriver();

	}

}
