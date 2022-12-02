package string;

public class Seperate1 {

	public static void main(String[] args) {
		
		String swap = "fg65fffg356ff23fg3322fg3f3f3f3g23325f56gh8h9g4555bb6g653";
		String Num="";
		String Alpha="";
		
		for (int i=0; i<swap.length(); i++) {
			char ch = swap.charAt(i);
			
			if (Character.isDigit(ch)) {
				Num=Num+ch;
			}
			else if (Character.isAlphabetic(ch)) {
				Alpha=Alpha+ch;
			}
		}
		System.out.println("Numbers from given String are : "+ Num);
		System.out.println("Alphabets from given String are : "+ Alpha);
	}

}
