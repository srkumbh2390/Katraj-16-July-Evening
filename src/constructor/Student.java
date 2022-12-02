package constructor;

public class Student {

	String name;
	int rollNo;
	char div;
	
	public Student(String s, int i, char c) {
		
		name=s;
		rollNo=i;
		div=c;		
	}
	public static void main(String[] args) {
		
		Student objectReference= new Student("Rohan", 10, 'A');
		
		System.out.println(objectReference.name);
		System.out.println(objectReference.rollNo);
		System.out.println(objectReference.div);

		

	}

}
