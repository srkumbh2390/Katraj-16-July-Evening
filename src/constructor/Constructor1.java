package constructor;

public class Constructor1 {

	
		int rollNo;	
		//Constructor of class
		public Constructor1 (int x) {
			
			rollNo=x;		
			System.out.println("Constructor of C1 " );		
		}
		public static void main(String[] args) {		
			Constructor1 var = new Constructor1(20);
	       System.out.println(var.rollNo);	


	}

}
