package encapsulation;

public class Im extends Ab {
	
	public Im () {
		super(10);
		System.out.println("Im---constructor");
	}
	public static void main(String[] args) {		
			Ab ref=new Im();
			ref.m1();
			ref.m3();
			
	}
	@Override
	public void m1() {
		System.out.println("m1---of sub class");		
	}
	@Override
	public void m3() {
		System.out.println("m3---of sub class");	
		
	}

}
