package integer;
import java.util.Scanner;

public class Enternumber {

	public static void main(String[] args) {
		
		// Creates a reader instance which takes
		// input from standard input - keyboard
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		//nextInt() reads the next integer from the keyboard
		int number = reader.nextInt();
		reader.close();
		
		//println() prints the following line to the output screen
		System.out.println("You entered: " + number);

	}

}
