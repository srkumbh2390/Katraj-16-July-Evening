package testNG2;

import java.io.IOException;
import java.util.Random;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestngListeners11 extends Listeners1 implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println("This is on Test Start Action");
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("This in on Test Success Action");
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("This is on Test Failure Action");
		
		//calling screenshot methods to capture screen 		
				Random no =new Random();		
				
				String name = result.getName()+ "_" + no.nextInt() ;
				
				try {
					ScreenShots1.captureScreen(driver, name);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("This in on Test Skipped Action");
	}
	
	

}
