package controlstatements;

public class NestedIfElseLargest1 {

	public static void main(String[] args) {
		
		double P = 9.91, Q = 9.35, R = 7.85;
		
		if(P >= Q) {
			if(P >= R) {
				System.out.println(P + " is the largest percentage out of 10");
			}			
		}
		
		else {
			if(Q >= R) {
				System.out.println(Q + " is the largest percentage out of 10");
			}
			else {
				System.out.println(R + " is the largest percentage out of 10");
			}
		}
		
	}

}
