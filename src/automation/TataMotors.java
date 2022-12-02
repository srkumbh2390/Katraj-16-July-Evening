package automation;

public class TataMotors {
	String Employee1;
	byte dailylunch;
	short monthsalary;
	int totalemployee;
	long annualturnover;
	float targetworkcomplete;
	double monthtravelingcharge;
	Boolean answer;	
	char section;
	public void Weeklyoff() {
		System.out.println("1. "+Employee1+" is the best automobile company in the world. ");
		System.out.println("2. The turnover of "+Employee1+ " annually is approximate "+annualturnover+"Rs. ");
		System.out.println("3. Total no of employees work in "+Employee1+" are "+totalemployee+". ");
		System.out.println("4. Monthly salary of permnent employee is "+monthsalary+"Rs. ");
		System.out.println("5. Daily lunch charge of each employee is "+dailylunch+"Rs. ");
		System.out.println("6. Traveling monthly charge is "+monthtravelingcharge+"Rs. ");
		System.out.println("7. Production target in each shift to complete work is minium "+targetworkcomplete+"%. ");
		System.out.println("8. Employee work in section "+section+". ");
		System.out.println("9. Weekly off is on Sunday. -- "+answer);
		
	}

	public static void main(String[] args) {
		
		TataMotors t1=new TataMotors();
		t1.Employee1="TataMotors1";
		
		//byte (-128 to 127)
		t1.dailylunch=15;
		
		//short (-32768 to 32767)
		t1.monthsalary=28950;
		
		//int (-2147483648 to 2147483647)
		t1.totalemployee=2012972318;
		
		//long (-9,223,372,036,854,775,808  to  9,223,372,036,854,775,807)
		t1.annualturnover=1504049502545l;
				
		t1.targetworkcomplete=85.50f;		
		
		t1.monthtravelingcharge=175.9535;
		
		//boolean (true/false)
		t1.answer=true;
		
		//char  (Stores a single byte character/letter)
	    t1.section='C';
		
		t1.Weeklyoff();
	}

}
