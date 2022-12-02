package testNG1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
public static void captureScreen(WebDriver driver,String name) throws IOException {
		
		String path = System.getProperty("user.dir") + "\\ScreenShots\\" + name+".png";		
		System.out.println(path);
		
		//step -1 Upcast		
		TakesScreenshot tss= (TakesScreenshot) driver;
		
		//step-2 capture screenshot		
		File sourceFile = tss.getScreenshotAs(OutputType.FILE);
		
		//step-3 
		
		File destinationFile = new File(path);
		
		//step-4 store file in desired location		
		FileHandler.copy(sourceFile, destinationFile);		
		System.out.println("successfully captured screenshot");		
	}
}
