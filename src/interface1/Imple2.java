package interface1;

public class Imple2 implements Inter2, Inter3{

	public static void main(String[] args) {
		Imple2  ref=new Imple2();
		ref.m1();
		ref.m2();
		ref.m3();
		ref.m4();
		ref.m5();
		ref.m7();	
		
		System.out.println(Inter2.x);
		System.out.println(Inter3.x);
	}
	@Override
	public void m4() {	
		System.out.println("m4--------ImpleClase");	
	}
	@Override
	public void m5() {	
		System.out.println("m5--------ImpleClase");	
	}

	@Override
	public void m1() {		
		System.out.println("m1--------ImpleClase");	
	}

	@Override
	public void m2() {		
		System.out.println("m2--------ImpleClase");	
	}
	public void m3() {
		System.out.println("m3--------ImpleClase");
	}
	@Override
	public void m7() {
		System.out.println("m7--------ImpleClase");	
	}
}
