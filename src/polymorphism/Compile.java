package polymorphism;
//Overloading in compile time polymorphism
public class Compile {
	public void behaviour() {
		System.out.println("Normal Behaviour");
	}
    public void behaviour(int x) {		
		System.out.println("Family  behaviour");		
	}
    public void behaviour(String s){		
  		System.out.println("Friendly behaviour");
  	}
	public static void main(String[] args) {
		Compile pol=new Compile();
		pol.behaviour("Hi");
		
	}

}
