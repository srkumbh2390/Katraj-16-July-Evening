package automation;

public class Dog1 {
	
	//state variable
	//declaration & initialization
	int age=10;
	String color="brown";
	String breed="German-shepherd";
	

	public static void main(String[] args) {
	
		//object creation
		    Dog1 obref=new Dog1();
		    
		//utilization 
	System.out.print(obref.age+ " " + obref.color + " " + obref.breed);
	}

}
