package string;

public class StringIntoint1 {

	public static void main(String[] args) {
		
		String name="123";
		int no=5;
		System.out.println(name+no);    
		
		//conversion from string into int
		int con=Integer.parseInt(name);
		
		System.out.println(con-no);
	}
}
