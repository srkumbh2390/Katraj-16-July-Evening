package controlstatements;

import java.util.Scanner;

public class ScannerMax {

	public static void main(String[] args) {
		
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter value of first number: x");
		int x = ref.nextInt();		
		
		System.out.println("Enter value of second number: y");
		int y = ref.nextInt();
		
		System.out.println("Enter value of third number: z");
		int z = ref.nextInt();
		
		ref.close();
		if(x>y && x>z) {
			System.out.println("Maximum number of x is: " + x);
		}
		
		else if(y>z) {
			System.out.println("Maximum number of y is: " + y);
		}
		
		else {
			System.out.println("Maximum number of z is: " + z);
			
		}

	}

}
