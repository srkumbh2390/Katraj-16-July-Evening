package encapsulation;

public class Im1 extends Ab1 {

	public static void main(String[] args) {
		Ab1 var=new Im1();
		var.m1();
		var.m3();
		var.m2();

	}

	@Override
	public void m1() {
		System.out.println("m1-----of sub clase");
		
	}

	
	@Override
	public void m3() {
		System.out.println("m3-----of sub clase");
		
	}

}
