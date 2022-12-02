package encapsulation;

public class Final {
		//Final variable
		final static int x=5000;
		
		//Final method
		public final void m1() {
			System.out.println("This is final m1 method  no agrument type");
		}	

		public final void m1(int x) {
			System.out.println("This is final m1 method -argument type");
		}	
	public static void main(String[] args) {
		Final ref=new Final();
		ref.m1(10);
	}

}
