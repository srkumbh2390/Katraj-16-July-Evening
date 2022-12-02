package assignment;

	// 02.08.2022-Q-2--Write a simple java program to initialize global variable (instance & static) through local variable.

public class GlobalToLocal0208002B {
	
		//Global Variable
		int salary;

	public static void main(String[] args) {
		
		//Object Creation
		GlobalToLocal0208002B ref = new GlobalToLocal0208002B();
		
		//Local Variable
		ref.salary=65000;
		
		//utilization
		System.out.println(ref.salary);
				
	}

}
