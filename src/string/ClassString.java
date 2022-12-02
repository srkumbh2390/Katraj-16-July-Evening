package string;

public class ClassString {

	public static void main(String[] args) {
		
		//first way of String declaration
		String sof = "Swapnil";
		String sof1 = "nil";
		
		//content comparison
		System.out.println(sof.equals(sof1));
		
		//object comparison
		System.out.println(sof==sof1);
		
		//equalsIgoneCase
		System.out.println(sof.equalsIgnoreCase(sof1));
		
		//compare partial content
		System.out.println(sof.contains(sof1));
		
		// second way of using new keyword		
		String city = new String ("Pune");
		String city1= new String ("Pune");
		
		// content comparison
		System.out.println(city.equals(city1));
		
		// object comparison
		System.out.println(city==city1);		
	}
}
