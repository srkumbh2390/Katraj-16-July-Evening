package interface1;

public class Imple1 implements Inter1{

	public static void main(String[] args) {	
		
		Imple1 imp=new Imple1();
		imp.m1();
		imp.m2();
		imp.m3();
		System.out.println(Inter1.x);

	}	@Override
	public void m1() {
		System.out.println("m1 --of Implementing class");		
	}
	@Override
	public void m2() {
		System.out.println("m2 --of Implementing class");		
	}
	public void m3() {
		System.out.println("m3---of Implementing class");
}
}
