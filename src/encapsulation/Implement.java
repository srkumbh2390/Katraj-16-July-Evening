package encapsulation;

public class Implement extends Abstract{
	
	public Implement() {
		this(10);
		System.out.println("Sub class implement constructor");
	}
	public Implement(int x) {
		super(20);
		System.out.println("Sub class constructor of argument type");
	}
	public static void main(String[] args) {		
			Abstract ref=new Implement();
			ref.method3();
	}
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
}
