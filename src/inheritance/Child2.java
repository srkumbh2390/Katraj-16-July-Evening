package inheritance;

public class Child2 extends IsTypeParent {
	public void cash (){		
		System.out.println("child2 - cash");		
	}
	public static void main(String[] args) {		
		Child2 ch=new Child2() ;
		
		//parent
		ch.land();
		
		ch.gold();
		
		//child2
		ch.cash();
	}
}
