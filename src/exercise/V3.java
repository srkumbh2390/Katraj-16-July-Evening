package exercise;

public class V3 {
	
	int noofStudentforMath=45;
	int noofStudentforEng=30;
	int totalstudents;

	public static void main(String[] args) {
		
		//object creation of class
		V3 ref = new V3();
		
		ref.totalstudents=(ref.noofStudentforMath + ref.noofStudentforEng);
		System.out.println(ref.totalstudents);
	}

}
