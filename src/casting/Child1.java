package casting;

public class Child1 extends Parent1{

	public void Learn() {
		System.out.println("Learn----------Method2 of C1");
	}

	public static void main(String[] args) {
	
		//Parent ref & Parent Object	
		Parent1 ref =new Parent1();		
	
		
	
		//down casting -Converting Super  type into sub type  
		Child1 var = (Child1)ref;    // run time exception
		var.Teach();
		
		// OR
		//2 -way of upcasting  P1 ref and C1 Object
		Child1 ref2=new Parent1();   // compile time error
		
		ref2.Teach();		
	}
}
