package automation;

public class Assignment2 {
	
	int x=20;
	static int y=30;
	
	public static void val() {
		int x;
		int y;
	}
	public static void main(String[] args) {
		
		Assignment2 as2=new Assignment2();
		
		Assignment2.val();
		{
			System.out.println(as2.x);
			System.out.println(as2.y);
		}
		
	}

}


