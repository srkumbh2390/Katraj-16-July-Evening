package constructor;

public class Cat {
	
    //global object var declration
	  Animal var; 	
	//constructor
	public Cat() {
		
		 var=new Animal();			
	}	
	public void eating() {
		
		System.out.println(var.AnimalName);
		System.out.println("Cat ---Eating");
	}	
	public void m1() {
		
		System.out.println(var.AnimalName);
	}
	public static void main(String[] args) {
			Cat ref =new Cat();
		
			ref.eating();
	}
}
