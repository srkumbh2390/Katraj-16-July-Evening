package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge1 {
	
	public static void edgeDriver1() {
		
		//set path require for creating driver instance
		System.setProperty("webdriver.edge.driver", "D:\\test\\Selenium\\Driver\\All Driver\\msedgedriver.exe");
		
		// step-1 creating object of edge driver
		WebDriver dri = new EdgeDriver();
		
		//step-2 maximize
		dri.manage().window().maximize();
		
		//step-3 open webpage
		dri.get("http://www.google.com");
	}

	public static void main(String[] args) {
		Edge1.edgeDriver1();
	}

}
