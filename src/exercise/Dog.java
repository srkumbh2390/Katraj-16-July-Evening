package exercise;

public class Dog {

	public static void main(String[] args) {
		
		//Object creation
		Dog ref = new Dog();
		ref.barking();
	}
	
	String name = "Labrador";
	int age = 10;
	
	public void barking() {
		System.out.println(name + " is barking & his age is " + age + (". "));
	}

}
