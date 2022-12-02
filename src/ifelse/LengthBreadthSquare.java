package ifelse;

import java.util.Scanner;

public class LengthBreadthSquare {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of Length");
		int x = sc.nextInt();
		
		System.out.println("Enter the value of Breadth");
		int y = sc.nextInt(); 
		
		if(x==y) {
			System.out.println("It is Square");
		}
		else {
			System.out.println("It is Rectangle");
		}
		
		sc.close();	

	}

}
