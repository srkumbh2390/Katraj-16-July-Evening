package assignment;

// 02.08.2022-Q-2--Write a simple java program to initialize global variable (instance & static) through local variable.

public class GlobalToLocal0208002A {
	
		//Global Variable
		static int salary;

	public static void main(String[] args) {
		
		//Local Variable
		int salary = 35000;
		
		//Utilization/Execution
		System.out.println(salary);
		
	}

}
