package accessmodifier;

public class ClassLevelDefaultAM1 {
	
	//variables
		//methods	
		 public  int x =20;	
		public  void m1() {		
			System.out.println("Default class level- method m1");		
		}	


	public static void main(String[] args) {
			
		ClassLevelDefaultAM1 ref =new ClassLevelDefaultAM1();         
        System.out.println(ref.x);         
        ref.m1();	

	}

}
