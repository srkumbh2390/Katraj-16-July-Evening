package controlstatements;

public class IfElseLargest2 {

	public static void main(String[] args) {
		
		int a = 4550, b = 6750, c = 5545;
		
		if(a >= b  && a >= c ) {
			
			System.out.println(a + " Rs. amount earn in 1 hour");
		}
		else if (b >= a  && b >= c) {
			
			System.out.println(b + " Rs. amount earn in 1 hour");
		}
		else {
			System.out.println(c + " Rs. amount earn in 1 hour");
		}
	}

}
