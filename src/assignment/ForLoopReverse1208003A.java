package assignment;

	//12.08.2022 Q3-Write a simple program to reverse given no? By for loop
	//int x=12345;
public class ForLoopReverse1208003A {

	public static void main(String[] args) {
		
		int num = 12345, reversed = 0;
		System.out.println("Original Number: " + num);
		
		for (;num != 0; num/=10) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
		}
		
		System.out.println("Reversed Number: " + reversed);	
	}
}
