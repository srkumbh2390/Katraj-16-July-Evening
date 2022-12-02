package loop;

	// Q2. This program will find the summation of numbers from 1 to 10.

public class WhileSum {

	public static void main(String[] args) {
		
			int x = 1, sum = 0;			
		
			//Exit when x becomes greater than 4
		while (x<=10) {
			
			//summing up x
			sum = sum + x;			
			
			//increment the value of x for
			//next iteration
			x++;
		}
		
		System.out.println("Summation: " + sum);
	}

}
