package automation;

import practinheritance.Private;

public class Dog extends Private{
	
	//state - Variable
	int age = 10;
	String Colo="Brown";
	String breed="German-shepherd";
	String action="barking";
	
	//action method
	public void barking() {
		System.out.println(breed + " having age "+ age);
		System.out.println(breed + " is barking");
	}
	
	public static void main(String[] args) {
		
		//object create
		    Dog var=new Dog();
		    var.barking();
		    Private ref=new Private();
			ref.P1();
	}
	    
	}

