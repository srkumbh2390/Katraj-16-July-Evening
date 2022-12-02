package polymorphism;
//method hiding
public class Child1 extends Parent1{
	//Method hide 
		public static void marry() {		
			System.out.println("Want to marry Sara - Love marriage");
		}
		public static void main(String[] args) {			
			
			//case- 3 Parent ref & child object		
			Parent1 p1=new Child1();		
			p1.marry();   //----->super class o/p-
		}
	}
