package automation;

public class Car2 {
	
	//global variable (Inside the class)- also instance variable
	int rollno=20;

	public static void main(String[] args) {
		
		//object creation
		Car2 ref = new Car2();
		
		//utilization
		System.out.println(ref.rollno);
		
		Car2 ref1 = new Car2();
		
		//local variable (Inside the method)
		ref1.rollno=40;
		
		System.out.println(ref1.rollno);

	}

}
