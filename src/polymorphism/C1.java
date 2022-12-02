package polymorphism;
//Method orverriding
public class C1 extends P1 {

	public void behaviour(){		
		System.out.println("Normal behaviour - C1");
	}
	public static void main(String[] args) {
				
		P1 ref=new P1();		
		ref.behaviour();		
		
		C1 ref1=new C1();
		ref1.behaviour();		
		
		P1 ref2=new C1();
		ref2.behaviour();
	}
}
