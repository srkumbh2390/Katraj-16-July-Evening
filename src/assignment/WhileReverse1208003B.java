package assignment;

//12.08.2022 Q3-Write a simple program to reverse given no? By while loop
	//int x=12345;

public class WhileReverse1208003B {

	public static void main(String[] args) {
		
		int num = 12345, reversed = 0;
		System.out.println("Original Number: " + num);
		
		//run loop until num becomes 0
		while (num != 0) {
			
			// get last digit from num
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			
			//remove the last digit from num
			num /= 10;
		}
		System.out.println("Reversed Number: " + reversed);

	}

}
