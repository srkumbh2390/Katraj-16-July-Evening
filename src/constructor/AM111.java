package constructor;

import accessmodifier.ClasslevelDefaultAM1;    // compile time error

public class AM111 {

	public static void main(String[] args) {
		
		ClasslevelDefaultAM1 ref=new ClasslevelDefaultAM1();   // compile time error		
		System.out.println(ref.x);		
		ref.m1();


	}

}
