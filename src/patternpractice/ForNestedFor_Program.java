package patternpractice;

public class ForNestedFor_Program {

	public static void main(String[] args) {
	for (int x=1; x<=5; x++) {			
			
			for (int y=1; y<=3; y++) {		
				
				System.out.print(y + " *-inner ");	
				
				System.out.print("     ");				
			}
			System.out.println(x + " #-outer ");
			
			System.out.println(" ");
			
		}
	}
}
