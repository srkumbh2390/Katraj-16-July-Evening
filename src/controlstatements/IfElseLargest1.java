package controlstatements;

public class IfElseLargest1 {

	public static void main(String[] args) {
		
		int Swapnil = 85000, Vishal = 98000, Mujib = 94000;
		
		if(Swapnil >= Vishal && Swapnil >= Mujib) {
			
			System.out.println(Swapnil + " is the highest salary." );
		}
		
		else if (Vishal >= Swapnil && Vishal >= Mujib) {
			
			System.out.println(Vishal + " is the highest salary.");
		}
		else {
			System.out.println(Mujib + " is the highest salary.");
		}
	}

}
