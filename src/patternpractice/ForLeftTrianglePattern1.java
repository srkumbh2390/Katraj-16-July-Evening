package patternpractice;

public class ForLeftTrianglePattern1 {

	public static void main(String[] args) {
		
		int n = 6;
		
		for (int x=1; x<=n; x++) {
			
			for (int y=1; y<=x; y++) {
				
				System.out.print("* ");
			}
			System.out.println("# ");
		}
	}
}
