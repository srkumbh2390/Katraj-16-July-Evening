package integer;

public class ExecutionTimeRecursiveMethod {
	
	//create a recursive method
	public int factorial( int n) {
		if (n !=0) //termination condition
			return n * factorial(n-1); // recursive call
		else
			return 1;
	}
	//main method
	public static void main(String[] args) {
		// create object of ExecutionTimeRecursiveMethod class
		ExecutionTimeRecursiveMethod obj = new ExecutionTimeRecursiveMethod();
		
		// get the start time
		long start = System.nanoTime();
		
		// call the method
		obj.factorial(128);
		
		// get the end time
		long end = System.nanoTime();
		
		//execution time in seconds
		long execution = (end - start);
		System.out.println("Execution Time Recursive Method is");
		System.out.println(execution + " nanoseconds");
		
		
	}

}
