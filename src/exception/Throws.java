package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws {	
	
	public static void main(String[] args) throws InterruptedException, FileNotFoundException  {		
		System.out.println("Statment 1");
		
		Thread.sleep(4000);
		
		FileInputStream fis =new FileInputStream("gdsgd//dushdhsd//dhsgdgs");		
		System.out.println("Statment 2");
}
}

