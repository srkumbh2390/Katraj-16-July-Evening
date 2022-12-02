package testNG1;

import java.io.IOException;
import java.util.Random;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngListeners2 extends NewTest4 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {		
		System.out.println("This is on test start action");
	}
	@Override
	public void onTestSuccess(ITestResult result) {	
		System.out.println("This is on test success action");
	}
	@Override
	public void onTestFailure(ITestResult result) {		
		//calling screenshot methods to capture screen 		
		Random no =new Random();		
		
		String name = result.getName()+ "_" + no.nextInt() ;
		
		try {
			ScreenShot.captureScreen(driver, name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("This is on test skipped action");
	}
}
