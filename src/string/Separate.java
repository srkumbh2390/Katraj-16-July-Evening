package string;

public class Separate {

	public static void main(String[] args) {
		
		String name = "12Faf3s45Gv3s";
		String no="";
		String alpha="";
		
		for (int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);
			
			if(Character.isDigit(ch)) {
				no=no+ch;
			}
			else if (Character.isAlphabetic(ch)) {
				alpha=alpha+ch;
				
			}
				
			}
		System.out.println("Number from given String: " + no);
		System.out.println("Alphabetic from given String: "+ alpha);
		
		}
	}


