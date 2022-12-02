package string;

public class String4 {

	public static void main(String[] args) {
		String name="yticoleV";		
		String name1="";
		
		System.out.println(name.length());
		
		for (int i=name.length()-1; i>=0; i--) {
			
			name1=name1+name.charAt(i);			
		}	
		System.out.println("Reverse String: "+ name1);
	}
}
