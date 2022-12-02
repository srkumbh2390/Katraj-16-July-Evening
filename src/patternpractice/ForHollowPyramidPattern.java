package patternpractice;

public class ForHollowPyramidPattern {

	public static void main(String[] args) {
		
		int n=8;
		
		for (int i=0; i<n; i++) {
			
			for (int j=0; j < n-i-1; j++) {
				System.out.print(" ");
			}
			for (int k=0; k < 2 * i +1; k++) {
				if (i == 0 || i == n-1) {
					System.out.print("*");
				}
				else {
					if (k == 0 || k == 2*i) {
						System.out.print("*");						
					}
					else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

	}

}
