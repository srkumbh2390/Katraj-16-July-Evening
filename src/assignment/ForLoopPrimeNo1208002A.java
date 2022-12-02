package assignment;

//12.08.2022 -Q2-Write a simple program to find out given no is prime or not? By for loop

public class ForLoopPrimeNo1208002A {

	public static void main(String[] args) {
		
		int num = 37;
		boolean flag = true;
		
		for (int i = 2; i <=num/2; i++) {
			
			//condition for nonprime number
			if (num % i == 0) {
			
				flag = false;
				
			}
		}
		
		if (flag) 
			System.out.println(num + " is a prime number.");
		else 
			System.out.println(num + " is not a prime number.");
		}	
	}


