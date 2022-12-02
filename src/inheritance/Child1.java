package inheritance;

public class Child1 extends Parent1 {
	int x =30;	
	public Child1() {
		super(10);
		System.out.println(this.x);
		System.out.println(super.x);
		System.out.println("C1 -constructor");
	}

	public static void main(String[] args) {		
		Child1 ref =new Child1();
		
	}
}
