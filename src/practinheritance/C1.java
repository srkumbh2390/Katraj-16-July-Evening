package practinheritance;
//Initialization of data members of subclass & super class-
public class C1 extends P1	 {
	
	int x ;	
	public C1(int y) {
		super(20);
		this.x=y;
		System.out.println(this.x);
		System.out.println(super.x);
		System.out.println("C1 -constructor");
	}
	public static void main(String[] args) {
		C1 ref =new C1(50);
	}
}
