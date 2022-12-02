package accessmodifier;

public class PrivateAM1 {
	
	//variables
		//methods
		
		private int x =20;
		
		private void m1() {
			
			System.out.println("Private method m1");		
		}


	public static void main(String[] args) {
		
		PrivateAM1 ref =new PrivateAM1();
        
        System.out.println(ref.x);
        
        ref.m1();

	}

}
