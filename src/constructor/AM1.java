package constructor;

import accessmodifier.DefaultAM2;

public class AM1 {

	public static void main(String[] args) {
		
		DefaultAM2 ref=new DefaultAM2();		
		System.out.println(ref.x);  // compile time error		
		ref.m1();                   //  compile time error


	}

}
