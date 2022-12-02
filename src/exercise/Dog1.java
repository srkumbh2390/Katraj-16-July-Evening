package exercise;

public class Dog1 {

	//State Variable
	//Declaration & Initialization
	int age = 10;
	String color = "Brown";
	String breed = "German-Shepherd";
	
	public static void main(String[] args) {
		
		//Object creation
		Dog1 obref = new Dog1();
		
		//Utilization
		System.out.println("The Dog age is " + obref.age + ", color "+ obref.color+"& breed " + obref.breed);

	}

}
