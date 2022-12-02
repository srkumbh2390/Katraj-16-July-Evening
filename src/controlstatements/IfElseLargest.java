package controlstatements;

//Write a simple java program using  if.. else to find out largest no.	
	// int x = 150,  int y = 200, int z = 90;


public class IfElseLargest {

	public static void main(String[] args) {
int x = 150, y = 200, z = 90;
		
		if ( x >= y && x >= z) {
			System.out.println(x + " is the largest number.");
		}
		else if (y >= x && y >= z) {
			System.out.println(y + " is the largest number.");
		}
		else
			System.out.println(z + " is the largest number.");

	}

}
