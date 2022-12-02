package assignment;

//01.08.2022 Q1-1.	Write simple java program to call instance variable in main method?  

public class Instance0108001 {
	
		// instance variable
		int rollno = 10;

	public static void main(String[] args) {
		
		//object creation
		Instance0108001 ref = new Instance0108001();
		
		//variable utilization
		System.out.println(ref.rollno);
		
	}

}
