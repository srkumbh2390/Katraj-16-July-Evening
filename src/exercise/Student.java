package exercise;

public class Student {
	
	//State/Variable/Data
	String name = "Swapnil";
	int age = 30;
	char div = 'A';
	
	//Method/Actions
	public void studying() {
		
	System.out.println(name + " is studying, he is " + age + "years old. \nHe studying in division " + div+" .");
	}


	public static void main(String[] args) {
		
		//Create object of class
		Student srk = new Student();
		srk.studying();
	}
	

}
