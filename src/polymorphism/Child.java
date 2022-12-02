package polymorphism;
//Overriding in RunTime Polymorphism
public class Child extends Parent{
	
	public  void marry() {		
		System.out.println("Want to marry Sara - Love marriage");
	}
	public static void main(String[] args) {
		
		//case -1 Parent ref & parent object
		Parent ref=new Parent();		
		ref.marry();
		
		//case- 2 Child ref & child object		
		Child ch=new Child();		
		ch.marry();
		
		//case- 3 Parent ref & child object		
		Parent p1=new Child();		
		p1.marry();
	}
}
