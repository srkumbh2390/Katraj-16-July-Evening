package accessmodifier;

public class PublicAM1 {
	
	//variables
		//methods
		
		 public  int x =20;
		
		public  void m1() {		
			System.out.println("Private method m1");		
		}


	public static void main(String[] args) {
		
		PublicAM1 ref =new PublicAM1();         
        System.out.println(ref.x);         
        ref.m1();	


	}

}
