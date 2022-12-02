package assignment;

//12.08.2022 -Q2-Write a simple program to find out given no is prime or not? By while loop

public class WhileLoopPrimeNo1208002B {

	public static void main(String[] args) {
		
		int num = 33,  i = 2 ; 
		boolean flag = true;
		
		while (i<=num/2) {
			
			//condition for nonprime number
		if (num % i == 0) {
			flag = false; break;
		}
		
		++i;
		}
		if (flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}

}
