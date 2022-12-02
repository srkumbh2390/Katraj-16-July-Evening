package inheritance;

public class HasTypeProfessor {
	
	HasTypeCollage ref;	
	public HasTypeProfessor () {		
		ref=new HasTypeCollage();
	}	
	public void markAttendance() {		
		ref.Attendance();		
		System.out.println("Marked Attendance Successfully");
	}


	public static void main(String[] args) {
		
		HasTypeProfessor var=new HasTypeProfessor();		
		var.markAttendance();

	}

}
