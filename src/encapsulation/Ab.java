package encapsulation;

public abstract class Ab {
	
	public Ab(int x) {
		System.out.println("Abstract class ----argument type constructor");		
	}
	//abstract method or incomplete method --which do not have implementation body
		public abstract void m1();	
		public abstract void m3();
		
		//complete method or concrete method
		public void m2() {		
			System.out.println("m2 ---method");
		}
	public static void main(String[] args) {		

	}
}
