package constructor;

public class Sedan {
	
	//Class type variable declration
    Vehicle objevariable;

public Sedan() {
	
	//Class type variable initalize
	objevariable = new Vehicle();		
}	
public void skid() {
	
	//Calling type variable from class Vehical type
	System.out.println(objevariable.type);		
	
	System.out.println("Skidd");
}


	public static void main(String[] args) {
	
		Sedan obj=new Sedan();		
		obj.skid();

	}

}
