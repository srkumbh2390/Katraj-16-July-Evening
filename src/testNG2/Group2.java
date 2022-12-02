package testNG2;

import org.testng.annotations.Test;

public class Group2 {

	@Test  (groups="sanity")
	public void alertHandle() {
		System.out.println("Alert Handle");
	}
	
	@Test (groups="integration")
	public void frameHandle() {
		System.out.println("Frame Handle");
	}
	
	@Test (groups="integration")
	public void captureScreen() {
		System.out.println("Capture Screen");
	}
}
