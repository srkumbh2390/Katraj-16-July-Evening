package interface1;

public class ImplementingClass1 implements Interface1{

	public static void main(String[] args) {
		ImplementingClass1 var = new ImplementingClass1();

		var.m1();
		var.m2();
		var.m3();
		var.m4();
		var.m5();
		var.m7();
		var.m8();
		
		System.out.println(Interface1.x);
		System.out.println(Interface2.x);
	}
	@Override
	public void m4() {
		System.out.println("m4 ---Implmenting class");			
	}

	@Override
	public void m5() {
		System.out.println("m5 ---Implmenting class");		
	}
	@Override
	public void m8() {
		System.out.println("m8 ---Implmenting class");		
	}
	@Override
	public void m1() {
		System.out.println("m1 ---Implmenting class");		
	}
	@Override
	public void m2() {
		System.out.println("m2 ---Implmenting class");		
	}
	public void m3() {		
		System.out.println("m3 ---Implmenting class");
	}
	@Override
	public void m7() {
		System.out.println("m7 ---Implmenting class");
		
	}

	
}
