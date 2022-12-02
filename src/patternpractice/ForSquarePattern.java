package patternpractice;

public class ForSquarePattern {

	public static void main(String[] args) {
		
		int n = 5;
		
		for (int x=1; x<=n; x++) {			
			
			for (int y=1; y<=n; y++) {		
				
				System.out.print("* ");		
			}
			System.out.println();			
		}
	}
}
