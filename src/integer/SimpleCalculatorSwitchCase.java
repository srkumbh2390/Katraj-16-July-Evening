package integer;
import java.util.Scanner;

public class SimpleCalculatorSwitchCase {

	public static void main(String[] args) {
		
		char operator;
		Double number1, number2, result;
		
		//create an object of Scanner class
		Scanner input = new Scanner(System.in);
		
		//ask users to enter operator
		System.out.println("Choose an operator: +, -, *, or /");
		operator = input.next().charAt(0);
		
		//ask users to enter numbers
		System.out.println("Enter First Number");
		number1 = input.nextDouble();
		
		System.out.println("Enter Second Number");
		number2 = input.nextDouble();
		
		input.close();
		
		switch (operator) {
		
		//performs addition between numbers
		case '+':
		   result = number1 + number2;
		   System.out.println(number1 + " + " + number2 + " = " + result);
		   break;
		   
		//performs subtraction between numbers
		case '-':
			result = number1 - number2;
			System.out.println(number1 + " + " + number2 + " = " + result);
			break;
			
		//performs subtraction between numbers
		case '*':
			result = number1 * number2;
			System.out.println(number1 + " + " + number2 + " = " + result);
			break;
		//performs subtraction between numbers
		case '/':
			result = number1 / number2;
			System.out.println(number1 + " + " + number2 + " = " + result);
			break;
		default:
			System.out.println("Invalid operator");
			break;
			
			
		  
		}
	}
}
		


