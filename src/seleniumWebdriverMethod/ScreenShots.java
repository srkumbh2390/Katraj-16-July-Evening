package seleniumWebdriverMethod;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots {
	
	static String path = "C:\\Users\\swapn\\eclipse-workspace\\Katraj 16-July-Evening\\ScreenShots\\snap1.png";
	
	public static void screenCapture(WebDriver driver) throws IOException {
		//step -1  upcast
		TakesScreenshot tss= (TakesScreenshot)driver;
		
		//step-2  capture screenshot
		File sourceFile = tss.getScreenshotAs(OutputType.FILE);
		
		//step-3 create object of File
		File destinationFile=new File(path);
		
		//step-4 store file in desired location
		FileHandler.copy(sourceFile, destinationFile);
		System.out.println("successfully captured screenshot");
		
	}
}
