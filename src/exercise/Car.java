package exercise;

public class Car {
	
	
	//Property Variable
	String color = "red";
	
	//Behavior Method
	public void drive() {
		System.out.println("I am Car driving & its "+ color + " color. ");
	}

	public static void main(String[] args) {
		
		//Object creation
		Car var = new Car();
		var.drive();
		

	}

}
