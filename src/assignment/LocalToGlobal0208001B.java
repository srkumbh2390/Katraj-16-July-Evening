package assignment;

		// Write a simple java program to initialize local variable through global variable (instance & static)  
		// int x=20
		// static int y=30; 

public class LocalToGlobal0208001B {

		//Global Variable
		int x = 20;

	public static void main(String[] args) {
		
		//Object Creation
		LocalToGlobal0208001B ref = new LocalToGlobal0208001B();
			
		//Utilization/Execution
		System.out.println(ref.x);
		
		
		}

}
