package integer;

public class ExecutionTime {
	
	//create a method
	public void display() {
		
	  System.out.println("Calculating Method Execution Time:");
	}
	
	//main method
	public static void main(String[] args) {
		
		//create an object of the Main class
		ExecutionTime obj = new ExecutionTime();
		
		//get start time
		long start = System.nanoTime();
		
		//call the method
		obj.display();
		
		//get the end time
		long end = System.nanoTime();
		
		//execution time
		long execution = end - start;
		System.out.println("Execution Time: " + execution + "nanoseconds");
		
		
	}

}
