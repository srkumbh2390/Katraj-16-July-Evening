package string;

public class Seperate2 {

	public static void main(String[] args) {
		String prad="23Sw09ap19ni90l12Pr11ad19ny90a";
		String DOB = "";
		String MyName="";
		
		for (int i=0; i<prad.length(); i++) {
			char ch = prad.charAt(i);
			
			if (Character.isDigit(ch)) {
				DOB=DOB+ch;
			}
			else if (Character.isAlphabetic(ch)) {
				MyName=MyName+ch;
			}
		}
		System.out.println("DOB : " + DOB);
		System.out.println("Myname : " + MyName);
	}
}
