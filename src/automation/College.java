package automation;

public class College {

	int noofstudentformath=25;
	int noofstudentforeng=28;
	int noofstudentforhindi=22;
	int totalstudent;
	
	public static void main(String[] args) {
		
		//Object Create of Class
		College ref=new College();
		
		ref.totalstudent=(ref.noofstudentformath + ref.noofstudentforeng + ref.noofstudentforhindi);
		System.out.println(ref.totalstudent);

	}

}
