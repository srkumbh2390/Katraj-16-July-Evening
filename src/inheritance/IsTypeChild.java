package inheritance;

public class IsTypeChild extends IsTypeParent, Parent2 {  // compile time error
	
	public void cash() {		
		System.out.println("Cash of child");
	}


	public static void main(String[] args) {
		
		IsTypeChild ch=new IsTypeChild();
		// Grand Parent Property
		ch.GoldCoins();
		
		//Parent class property
		ch.land();		
		ch.gold();
		
		//child property
		ch.cash();

	
}

