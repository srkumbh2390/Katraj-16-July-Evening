package integer;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = reader.nextInt();
		reader.close();
		
		String evenOdd = (num % 2 == 0) ? "Even" : "odd";
		System.out.println(num + " is " + evenOdd);
		

	}

}
