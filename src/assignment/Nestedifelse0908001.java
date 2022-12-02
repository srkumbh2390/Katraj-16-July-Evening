package assignment;

	// Write a simple java program using nested if else to find out largest no.	
	// int x = 40,  int y = 60, int z = 90;


public class Nestedifelse0908001 {

	public static void main(String[] args) {
	
		int x = 40, y = 60, z = 90;
		
		if(x >= y) {
			if(x >= z)
				System.out.println(x + " is the largest number.");
			else 
				System.out.println(z + " is the largest number.");
			}
		else {
			if(y >= z) 
				System.out.println(y + " is the largest number.");
			else
				System.out.println(z + " is the largest number.");
			}
		}
		
	}


