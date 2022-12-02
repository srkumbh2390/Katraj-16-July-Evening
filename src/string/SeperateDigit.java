package string;

public class SeperateDigit {

	public static void main(String[] args) {
		
		String name="25kd85ei98kke42g8h6f3f2f2f363d56egoo2";
		String no = "";
		String alpha="";
		
		for (int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);
			
			if (Character.isDigit(ch)) {
				no =no+ch;
			}
			else if (Character.isAlphabetic(ch)) {
				alpha=alpha+ch;
			}
		}
		System.out.println("No from given String: " + no);
		System.out.println("Alphabet from given String : " + alpha);
	}

}
