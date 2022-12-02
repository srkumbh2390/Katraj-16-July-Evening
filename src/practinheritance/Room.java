package practinheritance;
//Multiple inheritance
public class Room extends House, Home{    		// compile time error  
	
	publc void room3() {						 // compile time error
		System.out.println("Thre are 3 rooms");
	}

	public static void main(String[] args) {     // compile time error
		Room R=new Room();
		
		//House property
		R.Building1();
		R.complex();                             // compile time error
		
	}

}
