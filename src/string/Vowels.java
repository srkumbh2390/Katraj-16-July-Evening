package string;

public class Vowels {

	public static void main(String[] args) {
		 String name ="aefaghio";
		 String var ="AudsdsduTG"; 
		    for (int i =0 ; i<name.length();i++) {    	
		    	char ch =name.charAt(i);    	
		    	if (ch=='a'|| ch=='e' || ch=='i'||ch=='o'||ch=='u') {    		
		    		System.out.println("Char " + ch + " is vowel");
		    	}    
		    	
		    }	
	
		       
		   	 System.out.println(var.toUpperCase());	// AUDSDSDUTG
		   	System.out.println(name.toLowerCase()); // aefaghio

	}

}
