package encapsulation;

public class Final1 extends Final {
	
	public final void m1() {
		System.out.println("Final1-----m1 method");
	}

	public static void main(String[] args) {
		Final ref=new Final1();
		ref.m1();

	}

}
