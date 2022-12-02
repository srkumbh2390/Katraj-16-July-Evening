package accessmodifier;

public class ClassLevelPublicAM1 {
	
	//variables
		//methods	
		 public  int x =20;	
		public  void m1() {		
			System.out.println("Private method m1");		
		}


	public static void main(String[] args) {
		
		ClassLevelPublicAM1 ref =new ClassLevelPublicAM1();         
        System.out.println(ref.x);         
        ref.m1();	

	}

}
