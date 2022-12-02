package string;

public class SeperateVowels {

	public static void main(String[] args) {
		String name = " mdArkjfiffovvuekkdjjiueoaoijheaikkofffikjjfukjjEkka";
		
		for (int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);
			
			if((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') || (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')) { 
				
				System.out.println("Char "+ch+" is vowel");				
			}			
		}
	}
}
