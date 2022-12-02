package automation;
import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		char operation;
		double num1, num2, result;
		
		//User Input data
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose the following Operations: \n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division");
		operation=sc.next().charAt(0);
		
		
		System.out.println("Enter First Number");
		num1=sc.nextDouble();
		
		System.out.println("Enter Second Number");
		num2=sc.nextDouble();
		
		
		switch (operation) {
		
		case  '1':
			result = num1 + num2;
			System.out.println("Addition of two Numbers is : " + result);
			break;
			
		case '2':
			result = num1 - num2;
			System.out.println( "Subtraction of two Numbers is : " + result);
			break;
			
		case '3':
			result = num1 * num2;
			System.out.println("Multiplication of two Numbers is : " + result);
			break;
		
		case '4':
			result = num1 / num2;
			System.out.println("Division of two Numbers is : "+ result);
			break;
			
		default :
			System.out.println("You entered Invalid operation!");
			break;
		}
		
		sc.close();
		
		//System.out.println("Do you want another operation please select following operations: \n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division");
		//operation=sc.next().charAt(0);
		
	
	}
	
        
}
