package string;

public class String1 {

	public static void main(String[] args) {
	     //first way of string declaration
		String name="Velocity";
		String name1="Velocity";
		
		String var="Swapnil";
		String var1="Swap";				
		
		
		
		// content comparison
		System.out.println(name.equals(name1));		// true
		
		//object comparison
		System.out.println(name==name1);			// true
		
		//second way of new keyword 
		String place=new String("Pune");
		String place1=new String("Pune");
		
		//content comparison
		System.out.println(place.equals(place1));	//true
		
		//object comparison
		System.out.println(place==place1);			//false

	}

}
