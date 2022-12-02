package assignment;

		// Write a simple java program to initialize local variable through global variable (instance & static)  
		// int x=20
		// static int y=30;  

public class LocalToGlobal0208001A {
	
		//Global Variable
		static int x = 30;

	public static void main(String[] args) {
		
		//Local Variable
		int local = x;
		
		//Utilization/Execution
		System.out.println(local);
		

	}

}
