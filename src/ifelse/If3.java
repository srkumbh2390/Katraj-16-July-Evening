package ifelse;

import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		
		//defining a variable
		int number = sc.nextInt();
		
		//Check if the number is divisible by 2 or not
		if(number%2==0) {
			System.out.println("Even Number");
		}
		
		else {
			System.out.println("Odd Number");
		}
		sc.close();

	}

}
