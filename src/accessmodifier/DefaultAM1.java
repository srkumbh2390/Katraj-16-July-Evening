package accessmodifier;

public class DefaultAM1 {	

	//variables
	//methods
	
	 int x =20;
	
	 void m1() {
		
		System.out.println("Private method m1");		
	}	


	public static void main(String[] args) {
		
		DefaultAM1 ref =new DefaultAM1();
        
        System.out.println(ref.x);
        
        ref.m1();

	}

}
