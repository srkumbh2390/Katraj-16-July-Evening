package patternpractice;

public class ForHollowTrianglePattern {

	public static void main(String[] args) {
		
			int n = 8;
			
			for (int i=1; i<=n; i++) {
				
				for (int j=0; j<i; j++) {
					
					if (i != n) {
						
						if (j == 0 || j == i-1) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
	}
}
