package assignment;

		// 01.08.2022--Q2--Print default values of primitive type of instance variable?   

public class PrimitiveType0108002 {
		
		// instance variable
		byte age;
		short kilometer;
		int salary;
		long mobileno;
		float percentage;
		double molecules;
		char division;
		boolean result;
		String name;
		

	public static void main(String[] args) {
		
		// object creation
		PrimitiveType0108002 ref = new PrimitiveType0108002();
		
		//Utilization
		System.out.println("Default value of byte is: " + ref.age +"\nDefault value of short is: " + ref.kilometer + 
				"\nDefault value of int is: " + ref.salary + "\nDefault value of long is: " + ref.mobileno + 
				"\nDefault value of float is: " +ref.percentage +"\nDefault value of double is: " + ref.molecules + 
				"\nDefault value of char is: " + ref.division + "\nDefault value of boolean is: " +  ref.result + 
				"\nDefault value of String is: " + ref.name);
		
			// Default value for char is : empty space
	}

}
