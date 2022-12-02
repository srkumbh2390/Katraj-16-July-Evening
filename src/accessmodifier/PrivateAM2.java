package accessmodifier;

public class PrivateAM2 {

	public static void main(String[] args) {
		PrivateAM1 var=new PrivateAM1();		
		System.out.println(var.x); // compile time error	Private scope is only use in same class	
		var.m1();                  // compile time error


	}

}
