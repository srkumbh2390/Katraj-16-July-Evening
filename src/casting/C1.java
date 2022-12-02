package casting;

public class C1 extends P1 {
	
	public void m2() {
		System.out.println("Method2 of C1");
	}

	public static void main(String[] args) {
	
		//1- way 1 for up casting 
		C1 ref =new C1();		
		ref.m1();
		ref.m2();
		
		// Upcasting 
		//converting C1 type  into P1 type
		P1 var = ref;
		var.m1();
		
		// OR
		//2 -way of upcasting  P1 ref and C1 Object
		P1 ref2=new C1();
		
		ref2.m1();		
	}
}
