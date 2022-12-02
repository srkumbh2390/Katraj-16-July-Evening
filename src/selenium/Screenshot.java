package selenium;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.*;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	static String path = "C:\\Users\\swapn\\eclipse-workspace\\Katraj 16-July-Evening\\ScreenShots\\snap.png";
	
	public static void screenshotcap(WebDriver driver, String name) throws IOException {	
		//step-1  Upset
		String path =System.getProperty("user.dir") + "\\ScreenShots\\" + name+".png";
		TakesScreenshot tss=(TakesScreenshot)driver;
		
		//step-2 capture screenshot
		File sourceFile = tss.getScreenshotAs(OutputType.FILE);
		
		//step-3 create file object
		File destinationFile = new File(path);
		
		//step-4 file stored in desired location
		FileHandler.copy(sourceFile, destinationFile);
		System.out.println("Successfully captured screenshot");
		
		
	}

}
