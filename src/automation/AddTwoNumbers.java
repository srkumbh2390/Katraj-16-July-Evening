package automation;
import java.util.Scanner;

public class AddTwoNumbers {
	public static void main(String args[]) {
		//Assign variable for addition
		int num1, num2, sum;
		
		
		
		//Asking user to input data
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		num1=sc.nextInt();
		System.out.print("Enter Second Number: ");
		num2=sc.nextInt();		
		
		//Addition Two Numbers
		sum=num1+num2;
//		//Division Two Numbers
//		division=num1/num2;
//		//Multification Two Numbers
//		multification=num1*num2;
//		//Subtraction Two Numbers
//		subtraction=num1-num2;
		
		//Display Output
		System.out.println("Sum of Two Numbers is: "+sum);
		sc.close();
	}
}
